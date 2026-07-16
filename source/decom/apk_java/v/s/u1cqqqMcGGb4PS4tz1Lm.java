package v.s;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class u1cqqqMcGGb4PS4tz1Lm implements PnYB8dVhB84fPn {
    public static final SimpleDateFormat dDIMxZXP1V8HdM;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        dDIMxZXP1V8HdM = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private static /* synthetic */ void uymmx() {
    }

    @Override // v.s.AQdPoDKevTl3rj2pTsu
    public final void dDIMxZXP1V8HdM(Object obj, Object obj2) {
        ((iybiobD0qqQIasTkIw) obj2).vekpFI4d1Nc4fakF(dDIMxZXP1V8HdM.format((Date) obj));
    }
}

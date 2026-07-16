package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class tlG9soiU5ACqtsQ6 {
    public static final ThreadLocal dDIMxZXP1V8HdM = new ThreadLocal();

    public static JYn3foLRPO8BbEAlsg6f dDIMxZXP1V8HdM() {
        ThreadLocal threadLocal = dDIMxZXP1V8HdM;
        JYn3foLRPO8BbEAlsg6f jYn3foLRPO8BbEAlsg6f = (JYn3foLRPO8BbEAlsg6f) threadLocal.get();
        if (jYn3foLRPO8BbEAlsg6f != null) {
            return jYn3foLRPO8BbEAlsg6f;
        }
        RNi1jZSSTRTAH rNi1jZSSTRTAH = new RNi1jZSSTRTAH(Thread.currentThread());
        threadLocal.set(rNi1jZSSTRTAH);
        return rNi1jZSSTRTAH;
    }
}

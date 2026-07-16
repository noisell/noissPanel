package v.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Jf9nGec8iqajtj {
    private static final /* synthetic */ Jf9nGec8iqajtj[] $VALUES;
    public static final bAvFTTVw28PwR4v4x7A Companion;
    public static final Jf9nGec8iqajtj ON_ANY;
    public static final Jf9nGec8iqajtj ON_CREATE;
    public static final Jf9nGec8iqajtj ON_DESTROY;
    public static final Jf9nGec8iqajtj ON_PAUSE;
    public static final Jf9nGec8iqajtj ON_RESUME;
    public static final Jf9nGec8iqajtj ON_START;
    public static final Jf9nGec8iqajtj ON_STOP;

    static {
        Jf9nGec8iqajtj jf9nGec8iqajtj = new Jf9nGec8iqajtj("ON_CREATE", 0);
        ON_CREATE = jf9nGec8iqajtj;
        Jf9nGec8iqajtj jf9nGec8iqajtj2 = new Jf9nGec8iqajtj("ON_START", 1);
        ON_START = jf9nGec8iqajtj2;
        Jf9nGec8iqajtj jf9nGec8iqajtj3 = new Jf9nGec8iqajtj("ON_RESUME", 2);
        ON_RESUME = jf9nGec8iqajtj3;
        Jf9nGec8iqajtj jf9nGec8iqajtj4 = new Jf9nGec8iqajtj("ON_PAUSE", 3);
        ON_PAUSE = jf9nGec8iqajtj4;
        Jf9nGec8iqajtj jf9nGec8iqajtj5 = new Jf9nGec8iqajtj("ON_STOP", 4);
        ON_STOP = jf9nGec8iqajtj5;
        Jf9nGec8iqajtj jf9nGec8iqajtj6 = new Jf9nGec8iqajtj("ON_DESTROY", 5);
        ON_DESTROY = jf9nGec8iqajtj6;
        Jf9nGec8iqajtj jf9nGec8iqajtj7 = new Jf9nGec8iqajtj("ON_ANY", 6);
        ON_ANY = jf9nGec8iqajtj7;
        $VALUES = new Jf9nGec8iqajtj[]{jf9nGec8iqajtj, jf9nGec8iqajtj2, jf9nGec8iqajtj3, jf9nGec8iqajtj4, jf9nGec8iqajtj5, jf9nGec8iqajtj6, jf9nGec8iqajtj7};
        Companion = new bAvFTTVw28PwR4v4x7A();
    }

    private static /* synthetic */ void qkghknktgx() {
    }

    public static Jf9nGec8iqajtj valueOf(String str) {
        return (Jf9nGec8iqajtj) Enum.valueOf(Jf9nGec8iqajtj.class, str);
    }

    public static Jf9nGec8iqajtj[] values() {
        return (Jf9nGec8iqajtj[]) $VALUES.clone();
    }

    public final lK1IHVVetx4U dDIMxZXP1V8HdM() {
        switch (Feg5Xlo4Obc7GpQung.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return lK1IHVVetx4U.JXn4Qf7zpnLjP5;
            case 3:
            case 4:
                return lK1IHVVetx4U.Ee8d2j4S9Vm5yGuR;
            case 5:
                return lK1IHVVetx4U.xDyLpEZyrcKVe0;
            case 6:
                return lK1IHVVetx4U.w9sT1Swbhx3hs;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

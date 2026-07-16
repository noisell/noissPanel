package v.s;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kb5cLhNKzocCCzGJZQS extends pf6EfGexAWq4v {
    public final /* synthetic */ int w9sT1Swbhx3hs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb5cLhNKzocCCzGJZQS(nqLgv0zSLN5zLWr3 nqlgv0zsln5zlwr3, int i) {
        super(nqlgv0zsln5zlwr3);
        this.w9sT1Swbhx3hs = i;
    }

    private static /* synthetic */ void bhfrvrmzd() {
    }

    @Override // v.s.pf6EfGexAWq4v
    public final int dDIMxZXP1V8HdM() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // v.s.pf6EfGexAWq4v
    public final boolean vekpFI4d1Nc4fakF(Object obj) {
        boolean zBooleanValue;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                VkQG3YKcRU3qaiFy6K1 vkQG3YKcRU3qaiFy6K1 = (VkQG3YKcRU3qaiFy6K1) obj;
                return (vkQG3YKcRU3qaiFy6K1.dDIMxZXP1V8HdM && vkQG3YKcRU3qaiFy6K1.w9sT1Swbhx3hs) ? false : true;
            case 3:
                VkQG3YKcRU3qaiFy6K1 vkQG3YKcRU3qaiFy6K2 = (VkQG3YKcRU3qaiFy6K1) obj;
                return !vkQG3YKcRU3qaiFy6K2.dDIMxZXP1V8HdM || vkQG3YKcRU3qaiFy6K2.vekpFI4d1Nc4fakF;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    @Override // v.s.pf6EfGexAWq4v
    public final boolean w9sT1Swbhx3hs(sFdNPiaH9eT4T sfdnpiah9et4t) {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                return sfdnpiah9et4t.D5P1xCAyuvgF.w9sT1Swbhx3hs;
            case 1:
                return sfdnpiah9et4t.D5P1xCAyuvgF.JXn4Qf7zpnLjP5;
            case 2:
                return sfdnpiah9et4t.D5P1xCAyuvgF.dDIMxZXP1V8HdM == 100 + (-98);
            case 3:
                int i = sfdnpiah9et4t.D5P1xCAyuvgF.dDIMxZXP1V8HdM;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return sfdnpiah9et4t.D5P1xCAyuvgF.Ee8d2j4S9Vm5yGuR;
        }
    }
}

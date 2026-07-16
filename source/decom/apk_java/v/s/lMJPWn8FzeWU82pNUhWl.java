package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class lMJPWn8FzeWU82pNUhWl {
    public static final l1V0lQr6TbwNKqHfXNbb w9sT1Swbhx3hs;

    static {
        Integer num = IBg1tjskCApp7zXxj.dDIMxZXP1V8HdM;
        w9sT1Swbhx3hs = (num == null || num.intValue() >= 34) ? new mK2inw7EtW3HfMfj() : new qkPu3Zg7akH1eKPqN3();
    }

    public long Ee8d2j4S9Vm5yGuR(long j) {
        return xDyLpEZyrcKVe0(0L, j);
    }

    public abstract long JXn4Qf7zpnLjP5();

    public abstract int dDIMxZXP1V8HdM(int i);

    public int vekpFI4d1Nc4fakF(int i, int i2) {
        int iW9sT1Swbhx3hs;
        int i3;
        int iDDIMxZXP1V8HdM;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iW9sT1Swbhx3hs = w9sT1Swbhx3hs() >>> 1;
                    i3 = iW9sT1Swbhx3hs % i4;
                } while ((i4 - 1) + (iW9sT1Swbhx3hs - i3) < 0);
                iDDIMxZXP1V8HdM = i3;
            }
            return i + iDDIMxZXP1V8HdM;
        }
        while (true) {
            int iW9sT1Swbhx3hs2 = w9sT1Swbhx3hs();
            if (i <= iW9sT1Swbhx3hs2 && iW9sT1Swbhx3hs2 < i2) {
                return iW9sT1Swbhx3hs2;
            }
        }
    }

    public abstract int w9sT1Swbhx3hs();

    public long xDyLpEZyrcKVe0(long j, long j2) {
        long jJXn4Qf7zpnLjP5;
        long j3;
        long jDDIMxZXP1V8HdM;
        int iW9sT1Swbhx3hs;
        if (j2 <= j) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j) + ", " + Long.valueOf(j2) + ").").toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iW9sT1Swbhx3hs = dDIMxZXP1V8HdM(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iW9sT1Swbhx3hs = w9sT1Swbhx3hs();
                } else {
                    jDDIMxZXP1V8HdM = (((long) dDIMxZXP1V8HdM(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) w9sT1Swbhx3hs()) & 4294967295L);
                }
                jDDIMxZXP1V8HdM = ((long) iW9sT1Swbhx3hs) & 4294967295L;
            } else {
                do {
                    jJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5() >>> 1;
                    j3 = jJXn4Qf7zpnLjP5 % j4;
                } while ((j4 - 1) + (jJXn4Qf7zpnLjP5 - j3) < 0);
                jDDIMxZXP1V8HdM = j3;
            }
            return j + jDDIMxZXP1V8HdM;
        }
        while (true) {
            long jJXn4Qf7zpnLjP6 = JXn4Qf7zpnLjP5();
            if (j <= jJXn4Qf7zpnLjP6 && jJXn4Qf7zpnLjP6 < j2) {
                return jJXn4Qf7zpnLjP6;
            }
        }
    }
}

package v.s;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class eZ6soZeOs7kkqZcCQFOR implements B2htgWMZxsdry, SFSz9tfWEAQo {
    public static final TreeMap D5P1xCAyuvgF = new TreeMap();
    public final double[] Ee8d2j4S9Vm5yGuR;
    public final long[] JXn4Qf7zpnLjP5;
    public final int[] b1EoSIRjJHO5;
    public final byte[][] ibVTtJUNfrGYbW;
    public int pyu8ovAipBTLYAiKab;
    public volatile String vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final String[] xDyLpEZyrcKVe0;

    public eZ6soZeOs7kkqZcCQFOR(int i) {
        this.w9sT1Swbhx3hs = i;
        int i2 = i + 1;
        this.b1EoSIRjJHO5 = new int[i2];
        this.JXn4Qf7zpnLjP5 = new long[i2];
        this.Ee8d2j4S9Vm5yGuR = new double[i2];
        this.xDyLpEZyrcKVe0 = new String[i2];
        this.ibVTtJUNfrGYbW = new byte[i2][];
    }

    public static final eZ6soZeOs7kkqZcCQFOR D5P1xCAyuvgF(String str, int i) {
        TreeMap treeMap = D5P1xCAyuvgF;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor = new eZ6soZeOs7kkqZcCQFOR(i);
                ez6sozeos7kkqzccqfor.vekpFI4d1Nc4fakF = str;
                ez6sozeos7kkqzccqfor.pyu8ovAipBTLYAiKab = i;
                return ez6sozeos7kkqzccqfor;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor2 = (eZ6soZeOs7kkqZcCQFOR) entryCeilingEntry.getValue();
            ez6sozeos7kkqzccqfor2.vekpFI4d1Nc4fakF = str;
            ez6sozeos7kkqzccqfor2.pyu8ovAipBTLYAiKab = i;
            return ez6sozeos7kkqzccqfor2;
        }
    }

    private static /* synthetic */ void qgayxvt() {
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void MLSIo1htfMPWeB8V876L(String str, int i) {
        this.b1EoSIRjJHO5[i] = 4;
        this.xDyLpEZyrcKVe0[i] = str;
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void b1EoSIRjJHO5(int i, double d) {
        this.b1EoSIRjJHO5[i] = 3;
        this.Ee8d2j4S9Vm5yGuR[i] = d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // v.s.B2htgWMZxsdry
    public final String dDIMxZXP1V8HdM() {
        String str = this.vekpFI4d1Nc4fakF;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void dTS0S7eC32ubQH54j36(byte[] bArr, int i) {
        this.b1EoSIRjJHO5[i] = 50 - 45;
        this.ibVTtJUNfrGYbW[i] = bArr;
    }

    public final void hjneShqpF9Tis4() {
        TreeMap treeMap = D5P1xCAyuvgF;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.w9sT1Swbhx3hs), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // v.s.B2htgWMZxsdry
    public final void vekpFI4d1Nc4fakF(SFSz9tfWEAQo sFSz9tfWEAQo) {
        int i = this.pyu8ovAipBTLYAiKab;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.b1EoSIRjJHO5[i2];
            if (i3 == 1) {
                sFSz9tfWEAQo.xDyLpEZyrcKVe0(i2);
            } else if (i3 == 2) {
                sFSz9tfWEAQo.wotphlvK9sPbXJ(i2, this.JXn4Qf7zpnLjP5[i2]);
            } else if (i3 == 3) {
                sFSz9tfWEAQo.b1EoSIRjJHO5(i2, this.Ee8d2j4S9Vm5yGuR[i2]);
            } else if (i3 == 4) {
                String str = this.xDyLpEZyrcKVe0[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sFSz9tfWEAQo.MLSIo1htfMPWeB8V876L(str, i2);
            } else if (i3 == 5) {
                byte[] bArr = this.ibVTtJUNfrGYbW[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sFSz9tfWEAQo.dTS0S7eC32ubQH54j36(bArr, i2);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void wotphlvK9sPbXJ(int i, long j) {
        this.b1EoSIRjJHO5[i] = (-16) + 18;
        this.JXn4Qf7zpnLjP5[i] = j;
    }

    @Override // v.s.SFSz9tfWEAQo
    public final void xDyLpEZyrcKVe0(int i) {
        this.b1EoSIRjJHO5[i] = (-67) + 68;
    }
}

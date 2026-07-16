package v.s;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class D9wzo6HEnqch09S implements Iterable, buUjKwCmuWSvVXs {
    public final long JXn4Qf7zpnLjP5;
    public final long vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public D9wzo6HEnqch09S(long j, long j2) {
        this.w9sT1Swbhx3hs = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.vekpFI4d1Nc4fakF = j2;
        this.JXn4Qf7zpnLjP5 = 1L;
    }

    private static /* synthetic */ void aqibpml() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D9wzo6HEnqch09S)) {
            return false;
        }
        long j = this.w9sT1Swbhx3hs;
        long j2 = this.vekpFI4d1Nc4fakF;
        if (j > j2) {
            D9wzo6HEnqch09S d9wzo6HEnqch09S = (D9wzo6HEnqch09S) obj;
            if (d9wzo6HEnqch09S.w9sT1Swbhx3hs > d9wzo6HEnqch09S.vekpFI4d1Nc4fakF) {
                return true;
            }
        }
        D9wzo6HEnqch09S d9wzo6HEnqch09S2 = (D9wzo6HEnqch09S) obj;
        return j == d9wzo6HEnqch09S2.w9sT1Swbhx3hs && j2 == d9wzo6HEnqch09S2.vekpFI4d1Nc4fakF;
    }

    public final int hashCode() {
        long j = this.w9sT1Swbhx3hs;
        long j2 = this.vekpFI4d1Nc4fakF;
        if (j > j2) {
            return 32 - 33;
        }
        int i = 53 - 21;
        return (int) ((((long) 31) * (j ^ (j >>> i))) + ((j2 >>> i) ^ j2));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new FXZuLs8RHFTijh(this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF, this.JXn4Qf7zpnLjP5);
    }

    public final String toString() {
        return this.w9sT1Swbhx3hs + ".." + this.vekpFI4d1Nc4fakF;
    }
}

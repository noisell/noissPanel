package v.s;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vHgVg4NkL4VdR4ndb1m extends CancellationException {
    public final transient WGrwEyVqR28VYxamRhIg w9sT1Swbhx3hs;

    public vHgVg4NkL4VdR4ndb1m(String str, Throwable th, LPqJFMbrw2n1o lPqJFMbrw2n1o) {
        super(str);
        this.w9sT1Swbhx3hs = lPqJFMbrw2n1o;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vHgVg4NkL4VdR4ndb1m)) {
            return false;
        }
        vHgVg4NkL4VdR4ndb1m vhgvg4nkl4vdr4ndb1m = (vHgVg4NkL4VdR4ndb1m) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(vhgvg4nkl4vdr4ndb1m.getMessage(), getMessage()) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(vhgvg4nkl4vdr4ndb1m.w9sT1Swbhx3hs, this.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(vhgvg4nkl4vdr4ndb1m.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.w9sT1Swbhx3hs.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.w9sT1Swbhx3hs;
    }
}

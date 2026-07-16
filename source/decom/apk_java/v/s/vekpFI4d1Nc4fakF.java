package v.s;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class vekpFI4d1Nc4fakF extends LGm23hksIOxB implements deLJ4Z0aL3hcJ3O1 {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vekpFI4d1Nc4fakF(int i, Object obj) {
        super(1);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = obj;
    }

    private static /* synthetic */ void rubyyyi() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v.s.deLJ4Z0aL3hcJ3O1
    public final Object pyu8ovAipBTLYAiKab(Object obj) {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                return obj == ((XiR1pIn5878vVWd) this.JXn4Qf7zpnLjP5) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                Throwable th = (Throwable) obj;
                dEuDk0RLJ79RBD8fz4WE deudk0rlj79rbd8fz4we = (dEuDk0RLJ79RBD8fz4WE) this.JXn4Qf7zpnLjP5;
                if (th == null) {
                    if (!deudk0rlj79rbd8fz4we.w9sT1Swbhx3hs.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    deudk0rlj79rbd8fz4we.w9sT1Swbhx3hs.cancel(94 - 93);
                } else {
                    Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = deudk0rlj79rbd8fz4we.w9sT1Swbhx3hs;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    af6wX3D8R2iFhqxr.D5P1xCAyuvgF(th);
                }
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            case 2:
                hD886kxBkce8U hd886kxbkce8u = (hD886kxBkce8U) this.JXn4Qf7zpnLjP5;
                Eo0e0FTdv96U7KeCzoB eo0e0FTdv96U7KeCzoB = Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                hd886kxbkce8u.ibVTtJUNfrGYbW(eo0e0FTdv96U7KeCzoB);
                return eo0e0FTdv96U7KeCzoB;
            case 3:
                ((Xmmn1A4TQOiVOB) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM();
                return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
            default:
                VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = (VUjeMiNYIJhgmVJopga) obj;
                return ((CharSequence) this.JXn4Qf7zpnLjP5).subSequence(vUjeMiNYIJhgmVJopga.w9sT1Swbhx3hs, vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF + 1).toString();
        }
    }
}

package v.s;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xC3irfQAa9Bx implements JcWCvQYUtgV2xmu1 {
    public final tRxWok7X1jxqPS Ee8d2j4S9Vm5yGuR = new tRxWok7X1jxqPS(this);
    public final qlHclLGph5RUFd JXn4Qf7zpnLjP5;
    public OutputStream dDIMxZXP1V8HdM;
    public final HashMap vekpFI4d1Nc4fakF;
    public final HashMap w9sT1Swbhx3hs;
    public static final Charset xDyLpEZyrcKVe0 = Charset.forName("UTF-8");
    public static final edKoiDMpklbRUBLq ibVTtJUNfrGYbW = new edKoiDMpklbRUBLq("key", Y9mRyRdkl5FOcwb66V6.gmNWMfvn6zlEj(Y9mRyRdkl5FOcwb66V6.hjneShqpF9Tis4(xy0zCaVGt9TqYP.class, new gBVszwp96ZY4N(1))));
    public static final edKoiDMpklbRUBLq b1EoSIRjJHO5 = new edKoiDMpklbRUBLq("value", Y9mRyRdkl5FOcwb66V6.gmNWMfvn6zlEj(Y9mRyRdkl5FOcwb66V6.hjneShqpF9Tis4(xy0zCaVGt9TqYP.class, new gBVszwp96ZY4N(2))));
    public static final Xyz5nManK5eXi9DtYVSh pyu8ovAipBTLYAiKab = new Xyz5nManK5eXi9DtYVSh(1);

    public xC3irfQAa9Bx(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, qlHclLGph5RUFd qlhcllgph5rufd) {
        this.dDIMxZXP1V8HdM = byteArrayOutputStream;
        this.w9sT1Swbhx3hs = map;
        this.vekpFI4d1Nc4fakF = map2;
        this.JXn4Qf7zpnLjP5 = qlhcllgph5rufd;
    }

    private static /* synthetic */ void cpcpen() {
    }

    public static int ibVTtJUNfrGYbW(edKoiDMpklbRUBLq edkoidmpklbrublq) {
        xy0zCaVGt9TqYP xy0zcavgt9tqyp = (xy0zCaVGt9TqYP) ((Annotation) edkoidmpklbrublq.w9sT1Swbhx3hs.get(xy0zCaVGt9TqYP.class));
        if (xy0zcavgt9tqyp != null) {
            return ((gBVszwp96ZY4N) xy0zcavgt9tqyp).dDIMxZXP1V8HdM;
        }
        throw new O4K5KpahtuR0("Field has no @Protobuf config");
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 Ee8d2j4S9Vm5yGuR(edKoiDMpklbRUBLq edkoidmpklbrublq, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        xy0zCaVGt9TqYP xy0zcavgt9tqyp = (xy0zCaVGt9TqYP) ((Annotation) edkoidmpklbrublq.w9sT1Swbhx3hs.get(xy0zCaVGt9TqYP.class));
        if (xy0zcavgt9tqyp == null) {
            throw new O4K5KpahtuR0("Field has no @Protobuf config");
        }
        b1EoSIRjJHO5(((gBVszwp96ZY4N) xy0zcavgt9tqyp).dDIMxZXP1V8HdM << 3);
        pyu8ovAipBTLYAiKab(j);
        return this;
    }

    public final void JXn4Qf7zpnLjP5(edKoiDMpklbRUBLq edkoidmpklbrublq, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            b1EoSIRjJHO5((ibVTtJUNfrGYbW(edkoidmpklbrublq) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(xDyLpEZyrcKVe0);
            b1EoSIRjJHO5(bytes.length);
            this.dDIMxZXP1V8HdM.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                JXn4Qf7zpnLjP5(edkoidmpklbrublq, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                xDyLpEZyrcKVe0(pyu8ovAipBTLYAiKab, edkoidmpklbrublq, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            b1EoSIRjJHO5((ibVTtJUNfrGYbW(edkoidmpklbrublq) << 3) | 1);
            this.dDIMxZXP1V8HdM.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            b1EoSIRjJHO5((ibVTtJUNfrGYbW(edkoidmpklbrublq) << 3) | 5);
            this.dDIMxZXP1V8HdM.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            xy0zCaVGt9TqYP xy0zcavgt9tqyp = (xy0zCaVGt9TqYP) ((Annotation) edkoidmpklbrublq.w9sT1Swbhx3hs.get(xy0zCaVGt9TqYP.class));
            if (xy0zcavgt9tqyp == null) {
                throw new O4K5KpahtuR0("Field has no @Protobuf config");
            }
            b1EoSIRjJHO5(((gBVszwp96ZY4N) xy0zcavgt9tqyp).dDIMxZXP1V8HdM << 3);
            pyu8ovAipBTLYAiKab(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            vekpFI4d1Nc4fakF(edkoidmpklbrublq, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            b1EoSIRjJHO5((ibVTtJUNfrGYbW(edkoidmpklbrublq) << 3) | 2);
            b1EoSIRjJHO5(bArr.length);
            this.dDIMxZXP1V8HdM.write(bArr);
            return;
        }
        qlHclLGph5RUFd qlhcllgph5rufd = (qlHclLGph5RUFd) this.w9sT1Swbhx3hs.get(obj.getClass());
        if (qlhcllgph5rufd != null) {
            xDyLpEZyrcKVe0(qlhcllgph5rufd, edkoidmpklbrublq, obj, z);
            return;
        }
        PnYB8dVhB84fPn pnYB8dVhB84fPn = (PnYB8dVhB84fPn) this.vekpFI4d1Nc4fakF.get(obj.getClass());
        if (pnYB8dVhB84fPn != null) {
            tRxWok7X1jxqPS trxwok7x1jxqps = this.Ee8d2j4S9Vm5yGuR;
            trxwok7x1jxqps.dDIMxZXP1V8HdM = false;
            trxwok7x1jxqps.vekpFI4d1Nc4fakF = edkoidmpklbrublq;
            trxwok7x1jxqps.w9sT1Swbhx3hs = z;
            pnYB8dVhB84fPn.dDIMxZXP1V8HdM(obj, trxwok7x1jxqps);
            return;
        }
        if (obj instanceof FH9map4oTyuzWr) {
            vekpFI4d1Nc4fakF(edkoidmpklbrublq, ((FH9map4oTyuzWr) obj).dDIMxZXP1V8HdM(), true);
        } else if (obj instanceof Enum) {
            vekpFI4d1Nc4fakF(edkoidmpklbrublq, ((Enum) obj).ordinal(), true);
        } else {
            xDyLpEZyrcKVe0(this.JXn4Qf7zpnLjP5, edkoidmpklbrublq, obj, z);
        }
    }

    public final void b1EoSIRjJHO5(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.dDIMxZXP1V8HdM.write((i & 127) | 128);
            i >>>= 7;
        }
        this.dDIMxZXP1V8HdM.write(i & 127);
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 dDIMxZXP1V8HdM(edKoiDMpklbRUBLq edkoidmpklbrublq, int i) {
        vekpFI4d1Nc4fakF(edkoidmpklbrublq, i, true);
        return this;
    }

    public final void pyu8ovAipBTLYAiKab(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.dDIMxZXP1V8HdM.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.dDIMxZXP1V8HdM.write(((int) j) & 127);
    }

    public final void vekpFI4d1Nc4fakF(edKoiDMpklbRUBLq edkoidmpklbrublq, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        xy0zCaVGt9TqYP xy0zcavgt9tqyp = (xy0zCaVGt9TqYP) ((Annotation) edkoidmpklbrublq.w9sT1Swbhx3hs.get(xy0zCaVGt9TqYP.class));
        if (xy0zcavgt9tqyp == null) {
            throw new O4K5KpahtuR0("Field has no @Protobuf config");
        }
        b1EoSIRjJHO5(((gBVszwp96ZY4N) xy0zcavgt9tqyp).dDIMxZXP1V8HdM << 3);
        b1EoSIRjJHO5(i);
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 w9sT1Swbhx3hs(edKoiDMpklbRUBLq edkoidmpklbrublq, Object obj) {
        JXn4Qf7zpnLjP5(edkoidmpklbrublq, obj, true);
        return this;
    }

    public final void xDyLpEZyrcKVe0(qlHclLGph5RUFd qlhcllgph5rufd, edKoiDMpklbRUBLq edkoidmpklbrublq, Object obj, boolean z) throws IOException {
        I4IfeSpAputd6NtBgfh i4IfeSpAputd6NtBgfh = new I4IfeSpAputd6NtBgfh();
        i4IfeSpAputd6NtBgfh.w9sT1Swbhx3hs = 0L;
        try {
            OutputStream outputStream = this.dDIMxZXP1V8HdM;
            this.dDIMxZXP1V8HdM = i4IfeSpAputd6NtBgfh;
            try {
                qlhcllgph5rufd.dDIMxZXP1V8HdM(obj, this);
                this.dDIMxZXP1V8HdM = outputStream;
                long j = i4IfeSpAputd6NtBgfh.w9sT1Swbhx3hs;
                i4IfeSpAputd6NtBgfh.close();
                if (z && j == 0) {
                    return;
                }
                b1EoSIRjJHO5((ibVTtJUNfrGYbW(edkoidmpklbrublq) << 3) | 2);
                pyu8ovAipBTLYAiKab(j);
                qlhcllgph5rufd.dDIMxZXP1V8HdM(obj, this);
            } catch (Throwable th) {
                this.dDIMxZXP1V8HdM = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i4IfeSpAputd6NtBgfh.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

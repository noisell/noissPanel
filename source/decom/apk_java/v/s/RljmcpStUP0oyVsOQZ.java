package v.s;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RljmcpStUP0oyVsOQZ {
    public boolean JXn4Qf7zpnLjP5;
    public final List dDIMxZXP1V8HdM;
    public boolean vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;

    public RljmcpStUP0oyVsOQZ(List list) {
        this.dDIMxZXP1V8HdM = list;
    }

    private static /* synthetic */ void sxkk() {
    }

    public final OSOlo3oGIKrMzEnWP dDIMxZXP1V8HdM(SSLSocket sSLSocket) throws UnknownServiceException {
        OSOlo3oGIKrMzEnWP oSOlo3oGIKrMzEnWP;
        int i;
        boolean z;
        int i2 = this.w9sT1Swbhx3hs;
        List list = this.dDIMxZXP1V8HdM;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                oSOlo3oGIKrMzEnWP = null;
                break;
            }
            oSOlo3oGIKrMzEnWP = (OSOlo3oGIKrMzEnWP) list.get(i2);
            if (oSOlo3oGIKrMzEnWP.w9sT1Swbhx3hs(sSLSocket)) {
                this.w9sT1Swbhx3hs = i2 + 1;
                break;
            }
            i2++;
        }
        if (oSOlo3oGIKrMzEnWP == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.JXn4Qf7zpnLjP5 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.w9sT1Swbhx3hs;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((OSOlo3oGIKrMzEnWP) list.get(i3)).w9sT1Swbhx3hs(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.vekpFI4d1Nc4fakF = z;
        boolean z2 = this.JXn4Qf7zpnLjP5;
        String[] strArr = oSOlo3oGIKrMzEnWP.JXn4Qf7zpnLjP5;
        String[] strArr2 = oSOlo3oGIKrMzEnWP.vekpFI4d1Nc4fakF;
        String[] strArrQrz92kRPw4GcghAc = strArr2 != null ? yrMnf4fyLGfIJbMg8IbG.Qrz92kRPw4GcghAc(sSLSocket.getEnabledCipherSuites(), strArr2, qG9NzchKqUM6.vekpFI4d1Nc4fakF) : sSLSocket.getEnabledCipherSuites();
        String[] strArrQrz92kRPw4GcghAc2 = strArr != null ? yrMnf4fyLGfIJbMg8IbG.Qrz92kRPw4GcghAc(sSLSocket.getEnabledProtocols(), strArr, XtZTmeVKJy49qVqvVMLP.w9sT1Swbhx3hs) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        UNmzHr5eYlkMOkDR30 uNmzHr5eYlkMOkDR30 = qG9NzchKqUM6.vekpFI4d1Nc4fakF;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (uNmzHr5eYlkMOkDR30.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrQrz92kRPw4GcghAc = (String[]) Arrays.copyOf(strArrQrz92kRPw4GcghAc, strArrQrz92kRPw4GcghAc.length + 1);
            strArrQrz92kRPw4GcghAc[strArrQrz92kRPw4GcghAc.length - 1] = str;
        }
        Ltoz0r3CVQs428SqRrs ltoz0r3CVQs428SqRrs = new Ltoz0r3CVQs428SqRrs();
        ltoz0r3CVQs428SqRrs.dDIMxZXP1V8HdM = oSOlo3oGIKrMzEnWP.dDIMxZXP1V8HdM;
        ltoz0r3CVQs428SqRrs.w9sT1Swbhx3hs = strArr2;
        ltoz0r3CVQs428SqRrs.vekpFI4d1Nc4fakF = strArr;
        ltoz0r3CVQs428SqRrs.JXn4Qf7zpnLjP5 = oSOlo3oGIKrMzEnWP.w9sT1Swbhx3hs;
        ltoz0r3CVQs428SqRrs.w9sT1Swbhx3hs((String[]) Arrays.copyOf(strArrQrz92kRPw4GcghAc, strArrQrz92kRPw4GcghAc.length));
        ltoz0r3CVQs428SqRrs.JXn4Qf7zpnLjP5((String[]) Arrays.copyOf(strArrQrz92kRPw4GcghAc2, strArrQrz92kRPw4GcghAc2.length));
        OSOlo3oGIKrMzEnWP oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM = ltoz0r3CVQs428SqRrs.dDIMxZXP1V8HdM();
        if (oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF() != null) {
            sSLSocket.setEnabledProtocols(oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5);
        }
        if (oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.dDIMxZXP1V8HdM() != null) {
            sSLSocket.setEnabledCipherSuites(oSOlo3oGIKrMzEnWPDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF);
        }
        return oSOlo3oGIKrMzEnWP;
    }
}

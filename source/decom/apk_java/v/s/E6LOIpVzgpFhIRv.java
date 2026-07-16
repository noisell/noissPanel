package v.s;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class E6LOIpVzgpFhIRv extends QnMItFgHCjZ1bOS {
    public static final boolean vekpFI4d1Nc4fakF;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numHV4VTKNUdeHN = property != null ? VRUWMIt9DMXCmdEpyK46.hV4VTKNUdeHN(property) : null;
        boolean z = false;
        if (numHV4VTKNUdeHN == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numHV4VTKNUdeHN.intValue() >= 9) {
            z = true;
        }
        vekpFI4d1Nc4fakF = z;
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final void JXn4Qf7zpnLjP5(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((B62d1BWQ36VxGmXU) obj) != B62d1BWQ36VxGmXU.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((B62d1BWQ36VxGmXU) obj2).toString());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // v.s.QnMItFgHCjZ1bOS
    public final String xDyLpEZyrcKVe0(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}

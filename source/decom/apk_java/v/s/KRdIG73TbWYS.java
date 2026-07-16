package v.s;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KRdIG73TbWYS {
    public final lyzhjBmnW0B6JDw JXn4Qf7zpnLjP5;
    public final H0Eb9R69rKME dDIMxZXP1V8HdM;
    public final List vekpFI4d1Nc4fakF;
    public final qG9NzchKqUM6 w9sT1Swbhx3hs;

    public KRdIG73TbWYS(H0Eb9R69rKME h0Eb9R69rKME, qG9NzchKqUM6 qg9nzchkqum6, List list, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba) {
        this.dDIMxZXP1V8HdM = h0Eb9R69rKME;
        this.w9sT1Swbhx3hs = qg9nzchkqum6;
        this.vekpFI4d1Nc4fakF = list;
        this.JXn4Qf7zpnLjP5 = new lyzhjBmnW0B6JDw(new dgYqeynPOIkCjV1UTWhk(jRdueaGIH5g8DVCPba));
    }

    private static /* synthetic */ void cmiouug() {
    }

    public final List dDIMxZXP1V8HdM() {
        return (List) this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KRdIG73TbWYS)) {
            return false;
        }
        KRdIG73TbWYS kRdIG73TbWYS = (KRdIG73TbWYS) obj;
        return kRdIG73TbWYS.dDIMxZXP1V8HdM == this.dDIMxZXP1V8HdM && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(kRdIG73TbWYS.w9sT1Swbhx3hs, this.w9sT1Swbhx3hs) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(kRdIG73TbWYS.dDIMxZXP1V8HdM(), dDIMxZXP1V8HdM()) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(kRdIG73TbWYS.vekpFI4d1Nc4fakF, this.vekpFI4d1Nc4fakF);
    }

    public final int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode() + ((dDIMxZXP1V8HdM().hashCode() + ((this.w9sT1Swbhx3hs.hashCode() + ((this.dDIMxZXP1V8HdM.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        ArrayList arrayList = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(listDDIMxZXP1V8HdM));
        for (Certificate certificate : listDDIMxZXP1V8HdM) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.dDIMxZXP1V8HdM);
        sb.append(" cipherSuite=");
        sb.append(this.w9sT1Swbhx3hs);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.vekpFI4d1Nc4fakF;
        ArrayList arrayList2 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(list));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}

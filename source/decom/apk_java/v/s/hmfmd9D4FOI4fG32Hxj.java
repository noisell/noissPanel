package v.s;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hmfmd9D4FOI4fG32Hxj {
    public static final String[] vekpFI4d1Nc4fakF = {"*", "FCM", "GCM", ""};
    public final SharedPreferences dDIMxZXP1V8HdM;
    public final String w9sT1Swbhx3hs;

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public hmfmd9D4FOI4fG32Hxj(dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4) {
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        this.dDIMxZXP1V8HdM = dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM.getSharedPreferences("com.google.android.gms.appid", 0);
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF;
        String str = vTs3SU2MiIMPb2VCqAuc.Ee8d2j4S9Vm5yGuR;
        if (str == null) {
            dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
            str = vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.w9sT1Swbhx3hs = str;
    }

    public final String dDIMxZXP1V8HdM() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.dDIMxZXP1V8HdM) {
            String strEncodeToString = null;
            String string = this.dDIMxZXP1V8HdM.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}

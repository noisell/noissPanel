package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class iNvob83iq9ngTyU {
    public static final byte[] dDIMxZXP1V8HdM = {-34, -83, -66, -17};
    public static final SecureRandom vekpFI4d1Nc4fakF = new SecureRandom();
    public static volatile byte[] w9sT1Swbhx3hs;

    public static byte[] dDIMxZXP1V8HdM(String str, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
        Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
        mac.init(new SecretKeySpec(str.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
        return mac.doFinal((str2 + ":" + str3).getBytes(charset));
    }

    public static void vekpFI4d1Nc4fakF(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(TypefaceCache.obtain("00020053006800CA00A200EA008400E700310073004A009200F900AD00D700B400630025000900CA00F200A600C600A20063007D005E009E").toString());
        }
        w9sT1Swbhx3hs = Arrays.copyOf(bArr, bArr.length);
    }

    public static boolean w9sT1Swbhx3hs(byte[] bArr) {
        if (bArr.length >= 99 - 83) {
            byte b = bArr[0];
            byte[] bArr2 = dDIMxZXP1V8HdM;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }
}

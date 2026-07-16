package v.s;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class cuP2TNNPuNDgV8F {
    public static final byte dDIMxZXP1V8HdM = Byte.parseByte("01110000", 2);
    public static final byte w9sT1Swbhx3hs = Byte.parseByte("00001111", 2);

    public static String dDIMxZXP1V8HdM() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[12 + 4] = b;
        bArrArray[0] = (byte) ((b & w9sT1Swbhx3hs) | dDIMxZXP1V8HdM);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static /* synthetic */ void razlm() {
    }
}

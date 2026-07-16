package v.s;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class hPXhNf9INdrxF {
    public final long dDIMxZXP1V8HdM;

    public hPXhNf9INdrxF(long j) {
        this.dDIMxZXP1V8HdM = j;
    }

    public static hPXhNf9INdrxF dDIMxZXP1V8HdM(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        hPXhNf9INdrxF hpxhnf9indrxf = new hPXhNf9INdrxF(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return hpxhnf9indrxf;
                    }
                    hPXhNf9INdrxF hpxhnf9indrxf2 = new hPXhNf9INdrxF(jsonReader.nextLong());
                    jsonReader.close();
                    return hpxhnf9indrxf2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    private static /* synthetic */ void fyrritmwsx() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof hPXhNf9INdrxF) && this.dDIMxZXP1V8HdM == ((hPXhNf9INdrxF) obj).dDIMxZXP1V8HdM;
    }

    public final int hashCode() {
        long j = this.dDIMxZXP1V8HdM;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.dDIMxZXP1V8HdM + "}";
    }
}

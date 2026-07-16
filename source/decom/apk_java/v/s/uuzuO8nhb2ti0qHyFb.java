package v.s;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class uuzuO8nhb2ti0qHyFb {
    public static final /* synthetic */ int Ee8d2j4S9Vm5yGuR = 0;
    public static final long JXn4Qf7zpnLjP5 = TimeUnit.DAYS.toMillis(7);
    public final String dDIMxZXP1V8HdM;
    public final long vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public uuzuO8nhb2ti0qHyFb(String str, String str2, long j) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = j;
    }

    public static uuzuO8nhb2ti0qHyFb dDIMxZXP1V8HdM(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new uuzuO8nhb2ti0qHyFb(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new uuzuO8nhb2ti0qHyFb(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }
}

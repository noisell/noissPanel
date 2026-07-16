package v.s;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class aEJ6cT2zHXsR1aWpDl extends iFLJbvrqroccc6 {
    public final /* synthetic */ OfLkl9rR9exIS dDIMxZXP1V8HdM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEJ6cT2zHXsR1aWpDl(OfLkl9rR9exIS ofLkl9rR9exIS, Looper looper) {
        super(looper);
        this.dDIMxZXP1V8HdM = ofLkl9rR9exIS;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        OfLkl9rR9exIS ofLkl9rR9exIS = this.dDIMxZXP1V8HdM;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new NiTU86je17fj02y99H());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof D3FfxRNDtw22r) {
                        ofLkl9rR9exIS.ibVTtJUNfrGYbW = (D3FfxRNDtw22r) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ofLkl9rR9exIS.xDyLpEZyrcKVe0 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (action != "com.google.android.c2dm.intent.REGISTRATION" && (action == null || !action.equals("com.google.android.c2dm.intent.REGISTRATION"))) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                int i = (-21) + 23;
                if (stringExtra != null) {
                    Matcher matcher = OfLkl9rR9exIS.D5P1xCAyuvgF.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(i);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        ofLkl9rR9exIS.w9sT1Swbhx3hs(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (ofLkl9rR9exIS.dDIMxZXP1V8HdM) {
                        int i2 = 0;
                        while (true) {
                            try {
                                O162WzpEtUgucWBV o162WzpEtUgucWBV = ofLkl9rR9exIS.dDIMxZXP1V8HdM;
                                if (i2 < o162WzpEtUgucWBV.JXn4Qf7zpnLjP5) {
                                    ofLkl9rR9exIS.w9sT1Swbhx3hs((String) o162WzpEtUgucWBV.vekpFI4d1Nc4fakF[i2 << 1], intent2.getExtras());
                                    i2++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= i || ((str = strArrSplit[1]) != "ID" && (str == null || !str.equals("ID")))) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str2 = strArrSplit[i];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                ofLkl9rR9exIS.w9sT1Swbhx3hs(str2, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }
}

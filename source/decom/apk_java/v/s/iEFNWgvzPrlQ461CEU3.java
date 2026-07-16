package v.s;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class iEFNWgvzPrlQ461CEU3 implements L3dp66w8ustOJLN7unY {
    public static final Object gIIiyi2ddlMDR0 = new Object();
    public String D5P1xCAyuvgF;
    public final jbtbKB2tTtjICZw Ee8d2j4S9Vm5yGuR;
    public final JCr1uh5HvXwCK JXn4Qf7zpnLjP5;
    public final ExecutorService b1EoSIRjJHO5;
    public final dfwkxUDiclPw1BowH4 dDIMxZXP1V8HdM;
    public final ArrayList gmNWMfvn6zlEj;
    public final HashSet hjneShqpF9Tis4;
    public final Object ibVTtJUNfrGYbW;
    public final jNtR9eeHNtQpa pyu8ovAipBTLYAiKab;
    public final Hnsrhf2jJV8dCt vekpFI4d1Nc4fakF;
    public final ZnNamfORKnDP4nm4M w9sT1Swbhx3hs;
    public final cuP2TNNPuNDgV8F xDyLpEZyrcKVe0;

    static {
        new AtomicInteger(1);
    }

    public iEFNWgvzPrlQ461CEU3(dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4, zzxeBctTPcbuazkjVgh zzxebcttpcbuazkjvgh, ExecutorService executorService, jNtR9eeHNtQpa jntr9eehntqpa) {
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        ZnNamfORKnDP4nm4M znNamfORKnDP4nm4M = new ZnNamfORKnDP4nm4M(dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM, zzxebcttpcbuazkjvgh);
        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = new Hnsrhf2jJV8dCt();
        hnsrhf2jJV8dCt.vekpFI4d1Nc4fakF = dfwkxudiclpw1bowh4;
        if (fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj == null) {
            fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj = new fadfsJa4iEdiwEC4Xm8(16);
        }
        fadfsJa4iEdiwEC4Xm8 fadfsja4iediwec4xm8 = fadfsJa4iEdiwEC4Xm8.gmNWMfvn6zlEj;
        if (JCr1uh5HvXwCK.JXn4Qf7zpnLjP5 == null) {
            JCr1uh5HvXwCK.JXn4Qf7zpnLjP5 = new JCr1uh5HvXwCK(fadfsja4iediwec4xm8);
        }
        JCr1uh5HvXwCK jCr1uh5HvXwCK = JCr1uh5HvXwCK.JXn4Qf7zpnLjP5;
        jbtbKB2tTtjICZw jbtbkb2tttjiczw = new jbtbKB2tTtjICZw(new nel1EgalTqotjtE0sp3(2, dfwkxudiclpw1bowh4));
        cuP2TNNPuNDgV8F cup2tnnpundgv8f = new cuP2TNNPuNDgV8F();
        this.ibVTtJUNfrGYbW = new Object();
        this.hjneShqpF9Tis4 = new HashSet();
        this.gmNWMfvn6zlEj = new ArrayList();
        this.dDIMxZXP1V8HdM = dfwkxudiclpw1bowh4;
        this.w9sT1Swbhx3hs = znNamfORKnDP4nm4M;
        this.vekpFI4d1Nc4fakF = hnsrhf2jJV8dCt;
        this.JXn4Qf7zpnLjP5 = jCr1uh5HvXwCK;
        this.Ee8d2j4S9Vm5yGuR = jbtbkb2tttjiczw;
        this.xDyLpEZyrcKVe0 = cup2tnnpundgv8f;
        this.b1EoSIRjJHO5 = executorService;
        this.pyu8ovAipBTLYAiKab = jntr9eehntqpa;
    }

    public final void Ee8d2j4S9Vm5yGuR() {
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        SbxdZ6Kq2uhHQ5RPRqm.xDyLpEZyrcKVe0(dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        SbxdZ6Kq2uhHQ5RPRqm.xDyLpEZyrcKVe0(dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        SbxdZ6Kq2uhHQ5RPRqm.xDyLpEZyrcKVe0(dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String str = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
        Pattern pattern = JCr1uh5HvXwCK.vekpFI4d1Nc4fakF;
        if (!str.contains(":")) {
            throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        if (!JCr1uh5HvXwCK.vekpFI4d1Nc4fakF.matcher(dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM).matches()) {
            throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
    }

    public final SQzPENpgvzKX9IlD JXn4Qf7zpnLjP5() {
        Ee8d2j4S9Vm5yGuR();
        al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
        CdOUyqfur1C5O1p cdOUyqfur1C5O1p = new CdOUyqfur1C5O1p(this.JXn4Qf7zpnLjP5, al3codkxo0nvx);
        synchronized (this.ibVTtJUNfrGYbW) {
            this.gmNWMfvn6zlEj.add(cdOUyqfur1C5O1p);
        }
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = al3codkxo0nvx.dDIMxZXP1V8HdM;
        this.b1EoSIRjJHO5.execute(new fN2ZHZPlitdEQFE2bNv9(this, 2));
        return sQzPENpgvzKX9IlD;
    }

    public final void b1EoSIRjJHO5(Exception exc) {
        synchronized (this.ibVTtJUNfrGYbW) {
            try {
                Iterator it = this.gmNWMfvn6zlEj.iterator();
                while (it.hasNext()) {
                    if (((C54GwEf2mYSAfqYFDr) it.next()).dDIMxZXP1V8HdM(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void dDIMxZXP1V8HdM() {
        qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5;
        synchronized (gIIiyi2ddlMDR0) {
            try {
                dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
                dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
                icsq4nzWNlK1KIU2Hp icsq4nzwnlk1kiu2hpDDIMxZXP1V8HdM = icsq4nzWNlK1KIU2Hp.dDIMxZXP1V8HdM(dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM);
                try {
                    qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5 = this.vekpFI4d1Nc4fakF.b1EoSIRjJHO5();
                    int i = qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5.w9sT1Swbhx3hs;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5);
                        Hnsrhf2jJV8dCt hnsrhf2jJV8dCt = this.vekpFI4d1Nc4fakF;
                        P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM = qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5.dDIMxZXP1V8HdM();
                        p7b7KFoJnwoYcbDDIMxZXP1V8HdM.dDIMxZXP1V8HdM = strXDyLpEZyrcKVe0;
                        p7b7KFoJnwoYcbDDIMxZXP1V8HdM.w9sT1Swbhx3hs = 3;
                        qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5 = p7b7KFoJnwoYcbDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                        hnsrhf2jJV8dCt.xDyLpEZyrcKVe0(qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5);
                    }
                    if (icsq4nzwnlk1kiu2hpDDIMxZXP1V8HdM != null) {
                        icsq4nzwnlk1kiu2hpDDIMxZXP1V8HdM.ibVTtJUNfrGYbW();
                    }
                } catch (Throwable th) {
                    if (icsq4nzwnlk1kiu2hpDDIMxZXP1V8HdM != null) {
                        icsq4nzwnlk1kiu2hpDDIMxZXP1V8HdM.ibVTtJUNfrGYbW();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        pyu8ovAipBTLYAiKab(qhsm0nlcw4lyfi8kgzB1EoSIRjJHO5);
        this.pyu8ovAipBTLYAiKab.execute(new fN2ZHZPlitdEQFE2bNv9(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.s.ZnNamfORKnDP4nm4M] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [v.s.tyjTTrZMHzku] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final qhsM0NLCW4lYFI8kGz ibVTtJUNfrGYbW(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        String str = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM;
        String string = null;
        if (str != null && str.length() == 11) {
            hmfmd9D4FOI4fG32Hxj hmfmd9d4foi4fg32hxj = (hmfmd9D4FOI4fG32Hxj) this.Ee8d2j4S9Vm5yGuR.get();
            synchronized (hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM) {
                try {
                    String[] strArr = hmfmd9D4FOI4fG32Hxj.vekpFI4d1Nc4fakF;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM.getString("|T|" + hmfmd9d4foi4fg32hxj.w9sT1Swbhx3hs + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ZnNamfORKnDP4nm4M znNamfORKnDP4nm4M = this.w9sT1Swbhx3hs;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String str3 = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
        String str4 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
        String str5 = dfwkxudiclpw1bowh5.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh6 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh6.dDIMxZXP1V8HdM();
        String str6 = dfwkxudiclpw1bowh6.vekpFI4d1Nc4fakF.w9sT1Swbhx3hs;
        kmnfAB7VRd5sT5u kmnfab7vrd5st5u = znNamfORKnDP4nm4M.vekpFI4d1Nc4fakF;
        if (!kmnfab7vrd5st5u.dDIMxZXP1V8HdM()) {
            throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlDDIMxZXP1V8HdM = ZnNamfORKnDP4nm4M.dDIMxZXP1V8HdM("projects/" + str5 + "/installations");
        int i2 = 0;
        ?? r2 = znNamfORKnDP4nm4M;
        while (true) {
            ?? r14 = (-57) + 58;
            if (i2 > r14) {
                throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            ?? VekpFI4d1Nc4fakF = r2.vekpFI4d1Nc4fakF(urlDDIMxZXP1V8HdM, str3);
            try {
                try {
                    VekpFI4d1Nc4fakF.setRequestMethod("POST");
                    VekpFI4d1Nc4fakF.setDoOutput(r14);
                    if (string != null) {
                        VekpFI4d1Nc4fakF.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    ZnNamfORKnDP4nm4M.ibVTtJUNfrGYbW(VekpFI4d1Nc4fakF, str4, str6);
                    int responseCode = VekpFI4d1Nc4fakF.getResponseCode();
                    kmnfab7vrd5st5u.w9sT1Swbhx3hs(responseCode);
                    if (((responseCode < 200 || responseCode >= 396 + (-96)) ? 0 : r14) != 0) {
                        tyjTTrZMHzku tyjttrzmhzkuEe8d2j4S9Vm5yGuR = ZnNamfORKnDP4nm4M.Ee8d2j4S9Vm5yGuR(VekpFI4d1Nc4fakF);
                        VekpFI4d1Nc4fakF.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        r2 = tyjttrzmhzkuEe8d2j4S9Vm5yGuR;
                    } else {
                        try {
                            ZnNamfORKnDP4nm4M.w9sT1Swbhx3hs(VekpFI4d1Nc4fakF, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new SlO9I1a8dU6ZDZ8g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 443 + 57 || responseCode >= 600) {
                                tyjTTrZMHzku tyjttrzmhzku = new tyjTTrZMHzku(null, null, null, null, 2);
                                VekpFI4d1Nc4fakF.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                r2 = tyjttrzmhzku;
                            } else {
                                VekpFI4d1Nc4fakF.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                r2 = r2;
                            }
                        } catch (IOException | AssertionError unused2) {
                            VekpFI4d1Nc4fakF.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        VekpFI4d1Nc4fakF.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        r2 = r2;
                    }
                    int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(r2.Ee8d2j4S9Vm5yGuR);
                    if (iJ0zjQ7CAgohuxU20eCW6 != 0) {
                        if (iJ0zjQ7CAgohuxU20eCW6 != r14) {
                            throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM();
                        p7b7KFoJnwoYcbDDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR = "BAD CONFIG";
                        p7b7KFoJnwoYcbDDIMxZXP1V8HdM.w9sT1Swbhx3hs = 5;
                        return p7b7KFoJnwoYcbDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                    }
                    String str7 = r2.w9sT1Swbhx3hs;
                    String str8 = r2.vekpFI4d1Nc4fakF;
                    JCr1uh5HvXwCK jCr1uh5HvXwCK = this.JXn4Qf7zpnLjP5;
                    jCr1uh5HvXwCK.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jCr1uh5HvXwCK.dDIMxZXP1V8HdM.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    l3fPij8CYcI7xO l3fpij8cyci7xo = r2.JXn4Qf7zpnLjP5;
                    String str9 = l3fpij8cyci7xo.dDIMxZXP1V8HdM;
                    long j = l3fpij8cyci7xo.w9sT1Swbhx3hs;
                    P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM2 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM();
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM = str7;
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.w9sT1Swbhx3hs = 4;
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.vekpFI4d1Nc4fakF = str9;
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.JXn4Qf7zpnLjP5 = str8;
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.xDyLpEZyrcKVe0 = Long.valueOf(j);
                    p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.ibVTtJUNfrGYbW = Long.valueOf(seconds);
                    return p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                VekpFI4d1Nc4fakF.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
    }

    public final void pyu8ovAipBTLYAiKab(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        synchronized (this.ibVTtJUNfrGYbW) {
            try {
                Iterator it = this.gmNWMfvn6zlEj.iterator();
                while (it.hasNext()) {
                    if (((C54GwEf2mYSAfqYFDr) it.next()).w9sT1Swbhx3hs(qhsm0nlcw4lyfi8kgz)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SQzPENpgvzKX9IlD vekpFI4d1Nc4fakF() {
        String str;
        Ee8d2j4S9Vm5yGuR();
        synchronized (this) {
            str = this.D5P1xCAyuvgF;
        }
        if (str != null) {
            return SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(str);
        }
        al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
        zhROefH7iXEUnG zhroefh7ixeung = new zhROefH7iXEUnG(al3codkxo0nvx);
        synchronized (this.ibVTtJUNfrGYbW) {
            this.gmNWMfvn6zlEj.add(zhroefh7ixeung);
        }
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlD = al3codkxo0nvx.dDIMxZXP1V8HdM;
        this.b1EoSIRjJHO5.execute(new fN2ZHZPlitdEQFE2bNv9(this, 0));
        return sQzPENpgvzKX9IlD;
    }

    public final qhsM0NLCW4lYFI8kGz w9sT1Swbhx3hs(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        HttpURLConnection httpURLConnectionVekpFI4d1Nc4fakF;
        l3fPij8CYcI7xO l3fpij8cyci7xoXDyLpEZyrcKVe0;
        ZnNamfORKnDP4nm4M znNamfORKnDP4nm4M = this.w9sT1Swbhx3hs;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        String str = dfwkxudiclpw1bowh4.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM;
        String str2 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
        String str3 = dfwkxudiclpw1bowh5.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW;
        String str4 = qhsm0nlcw4lyfi8kgz.JXn4Qf7zpnLjP5;
        kmnfAB7VRd5sT5u kmnfab7vrd5st5u = znNamfORKnDP4nm4M.vekpFI4d1Nc4fakF;
        if (!kmnfab7vrd5st5u.dDIMxZXP1V8HdM()) {
            throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlDDIMxZXP1V8HdM = ZnNamfORKnDP4nm4M.dDIMxZXP1V8HdM("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionVekpFI4d1Nc4fakF = znNamfORKnDP4nm4M.vekpFI4d1Nc4fakF(urlDDIMxZXP1V8HdM, str);
            try {
                try {
                    httpURLConnectionVekpFI4d1Nc4fakF.setRequestMethod("POST");
                    httpURLConnectionVekpFI4d1Nc4fakF.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionVekpFI4d1Nc4fakF.setDoOutput(true);
                    ZnNamfORKnDP4nm4M.b1EoSIRjJHO5(httpURLConnectionVekpFI4d1Nc4fakF);
                    int responseCode = httpURLConnectionVekpFI4d1Nc4fakF.getResponseCode();
                    kmnfab7vrd5st5u.w9sT1Swbhx3hs(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        l3fpij8cyci7xoXDyLpEZyrcKVe0 = ZnNamfORKnDP4nm4M.xDyLpEZyrcKVe0(httpURLConnectionVekpFI4d1Nc4fakF);
                        break;
                    }
                    ZnNamfORKnDP4nm4M.w9sT1Swbhx3hs(httpURLConnectionVekpFI4d1Nc4fakF, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM = l3fPij8CYcI7xO.dDIMxZXP1V8HdM();
                        sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.w9sT1Swbhx3hs = 3;
                        l3fpij8cyci7xoXDyLpEZyrcKVe0 = sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new SlO9I1a8dU6ZDZ8g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 427 + 73 || responseCode >= 600) {
                        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM2 = l3fPij8CYcI7xO.dDIMxZXP1V8HdM();
                        sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM2.w9sT1Swbhx3hs = 2;
                        l3fpij8cyci7xoXDyLpEZyrcKVe0 = sfr0aaw8vbbkmexjhdwkDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
                        break;
                    }
                    httpURLConnectionVekpFI4d1Nc4fakF.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionVekpFI4d1Nc4fakF.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionVekpFI4d1Nc4fakF.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(l3fpij8cyci7xoXDyLpEZyrcKVe0.vekpFI4d1Nc4fakF);
        if (iJ0zjQ7CAgohuxU20eCW6 != 0) {
            if (iJ0zjQ7CAgohuxU20eCW6 == 1) {
                P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM();
                p7b7KFoJnwoYcbDDIMxZXP1V8HdM.Ee8d2j4S9Vm5yGuR = "BAD CONFIG";
                p7b7KFoJnwoYcbDDIMxZXP1V8HdM.w9sT1Swbhx3hs = 5;
                return p7b7KFoJnwoYcbDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            }
            if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                throw new SlO9I1a8dU6ZDZ8g("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.D5P1xCAyuvgF = null;
            }
            P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM2 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM();
            p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.w9sT1Swbhx3hs = 2;
            return p7b7KFoJnwoYcbDDIMxZXP1V8HdM2.dDIMxZXP1V8HdM();
        }
        String str5 = l3fpij8cyci7xoXDyLpEZyrcKVe0.dDIMxZXP1V8HdM;
        long j = l3fpij8cyci7xoXDyLpEZyrcKVe0.w9sT1Swbhx3hs;
        JCr1uh5HvXwCK jCr1uh5HvXwCK = this.JXn4Qf7zpnLjP5;
        jCr1uh5HvXwCK.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jCr1uh5HvXwCK.dDIMxZXP1V8HdM.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        P7b7KFoJnwoYcb p7b7KFoJnwoYcbDDIMxZXP1V8HdM3 = qhsm0nlcw4lyfi8kgz.dDIMxZXP1V8HdM();
        p7b7KFoJnwoYcbDDIMxZXP1V8HdM3.vekpFI4d1Nc4fakF = str5;
        p7b7KFoJnwoYcbDDIMxZXP1V8HdM3.xDyLpEZyrcKVe0 = Long.valueOf(j);
        p7b7KFoJnwoYcbDDIMxZXP1V8HdM3.ibVTtJUNfrGYbW = Long.valueOf(seconds);
        return p7b7KFoJnwoYcbDDIMxZXP1V8HdM3.dDIMxZXP1V8HdM();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[Catch: all -> 0x0041, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003f, B:19:0x0043, B:20:0x0047, B:28:0x005c, B:12:0x0031, B:13:0x003c), top: B:33:0x002e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003f, B:19:0x0043, B:20:0x0047, B:28:0x005c, B:12:0x0031, B:13:0x003c), top: B:33:0x002e, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String xDyLpEZyrcKVe0(qhsM0NLCW4lYFI8kGz qhsm0nlcw4lyfi8kgz) {
        hmfmd9D4FOI4fG32Hxj hmfmd9d4foi4fg32hxj;
        String string;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = this.dDIMxZXP1V8HdM;
        dfwkxudiclpw1bowh4.dDIMxZXP1V8HdM();
        if (!dfwkxudiclpw1bowh4.w9sT1Swbhx3hs.equals("CHIME_ANDROID_SDK")) {
            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh5 = this.dDIMxZXP1V8HdM;
            dfwkxudiclpw1bowh5.dDIMxZXP1V8HdM();
            if ("[DEFAULT]".equals(dfwkxudiclpw1bowh5.w9sT1Swbhx3hs)) {
                if (qhsm0nlcw4lyfi8kgz.w9sT1Swbhx3hs == 1) {
                    hmfmd9d4foi4fg32hxj = (hmfmd9D4FOI4fG32Hxj) this.Ee8d2j4S9Vm5yGuR.get();
                    synchronized (hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM) {
                        try {
                            synchronized (hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM) {
                                string = hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.xDyLpEZyrcKVe0.getClass();
                    return cuP2TNNPuNDgV8F.dDIMxZXP1V8HdM();
                }
            }
        } else if (qhsm0nlcw4lyfi8kgz.w9sT1Swbhx3hs == 1) {
            hmfmd9d4foi4fg32hxj = (hmfmd9D4FOI4fG32Hxj) this.Ee8d2j4S9Vm5yGuR.get();
            synchronized (hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM) {
                synchronized (hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM) {
                    string = hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM.getString("|S|id", null);
                    if (string != null) {
                        string = hmfmd9d4foi4fg32hxj.dDIMxZXP1V8HdM();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.xDyLpEZyrcKVe0.getClass();
                    return cuP2TNNPuNDgV8F.dDIMxZXP1V8HdM();
                }
            }
        }
        this.xDyLpEZyrcKVe0.getClass();
        return cuP2TNNPuNDgV8F.dDIMxZXP1V8HdM();
    }
}

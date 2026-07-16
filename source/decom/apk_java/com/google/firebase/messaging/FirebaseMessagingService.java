package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v.s.D3nkzQlSKjHnRbwlOY;
import v.s.DixbgjZDrgKGsYk0Hj;
import v.s.EqyzqFUBl9ymZze;
import v.s.L3dp66w8ustOJLN7unY;
import v.s.NeMF2Rxt7VnmPi5V;
import v.s.OYRwk007Mtyi;
import v.s.OfLkl9rR9exIS;
import v.s.QbnuJYfmluA6tNLYu;
import v.s.SQzPENpgvzKX9IlD;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.UWYuX9UTvV9YpFO4TOW;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.VTs3SU2MiIMPb2VCqAuc;
import v.s.XWeGEfwLMEloqb5;
import v.s.YqGxPPaYwAVe9;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.iEFNWgvzPrlQ461CEU3;
import v.s.j378CNXHLyDTS1wSJ;
import v.s.jlshFfo9etdTz;
import v.s.mYrXZiFjFW2Xg;
import v.s.oO26y14q3Pwf;
import v.s.okZcyTTNtG3Y;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.wPtsfm3myEKujwPqCE;
import v.s.wx1uy9kWo2J3;
import v.s.x88LUeZhTf5gc;
import v.s.y6jRGLEWNMir;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE);
    private OfLkl9rR9exIS rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (r5XEUfod5GSCCwq6c.XiR1pIn5878vVWd(extras)) {
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = new r5XEUfod5GSCCwq6c(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new okZcyTTNtG3Y("Firebase-Messaging-Network-Io"));
            UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOW = new UWYuX9UTvV9YpFO4TOW();
            uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs = executorServiceNewSingleThreadExecutor;
            uWYuX9UTvV9YpFO4TOW.vekpFI4d1Nc4fakF = this;
            uWYuX9UTvV9YpFO4TOW.JXn4Qf7zpnLjP5 = r5xeufod5gsccwq6c;
            try {
                if (uWYuX9UTvV9YpFO4TOW.vekpFI4d1Nc4fakF()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (y6jRGLEWNMir.XiR1pIn5878vVWd(intent)) {
                        y6jRGLEWNMir.pyu8ovAipBTLYAiKab("_nf", intent.getExtras());
                    }
                }
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new D3nkzQlSKjHnRbwlOY(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private OfLkl9rR9exIS getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new OfLkl9rR9exIS(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        int i;
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        OfLkl9rR9exIS rpc = getRpc(this);
        if (rpc.vekpFI4d1Nc4fakF.dDIMxZXP1V8HdM() < 233700000) {
            new SQzPENpgvzKX9IlD().D5P1xCAyuvgF(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        bundle.putString("google.message_id", stringExtra);
        Integer numValueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
        if (numValueOf != null) {
            bundle.putInt("google.product_id", numValueOf.intValue());
        }
        NeMF2Rxt7VnmPi5V neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM = NeMF2Rxt7VnmPi5V.dDIMxZXP1V8HdM(rpc.w9sT1Swbhx3hs);
        synchronized (neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM) {
            i = neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
            neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = i + 1;
        }
        neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.w9sT1Swbhx3hs(new wx1uy9kWo2J3(i, 3, bundle, 0));
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fb A[Catch: NumberFormatException -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x020a, blocks: (B:118:0x01fb, B:126:0x0216), top: B:162:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0201  */
    /* JADX WARN: Code duplicated, block: B:123:0x020d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216 A[Catch: NumberFormatException -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x020a, blocks: (B:118:0x01fb, B:126:0x0216), top: B:162:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    private void passMessageIntentToSdk(Intent intent) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z;
        QbnuJYfmluA6tNLYu qbnuJYfmluA6tNLYu;
        long j;
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs;
        VTs3SU2MiIMPb2VCqAuc vTs3SU2MiIMPb2VCqAuc;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        int iIntValue = 0;
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                return;
            case "gcm":
                if (y6jRGLEWNMir.XiR1pIn5878vVWd(intent)) {
                    y6jRGLEWNMir.pyu8ovAipBTLYAiKab("_nr", intent.getExtras());
                }
                if (ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
                    z = false;
                } else {
                    try {
                        dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs2 = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                        dfwkxudiclpw1bowh4W9sT1Swbhx3hs2.dDIMxZXP1V8HdM();
                        Context context = dfwkxudiclpw1bowh4W9sT1Swbhx3hs2.dDIMxZXP1V8HdM;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z = false;
                            } else {
                                z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    }
                }
                if (z && (qbnuJYfmluA6tNLYu = FirebaseMessaging.gmNWMfvn6zlEj) != null) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = Bundle.EMPTY;
                    }
                    Object obj = extras.get("google.ttl");
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    int i = iIntValue;
                    String string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs3 = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                            Object obj2 = iEFNWgvzPrlQ461CEU3.gIIiyi2ddlMDR0;
                            dfwkxudiclpw1bowh4W9sT1Swbhx3hs3.dDIMxZXP1V8HdM();
                            string = (String) SbxdZ6Kq2uhHQ5RPRqm.dDIMxZXP1V8HdM(((iEFNWgvzPrlQ461CEU3) dfwkxudiclpw1bowh4W9sT1Swbhx3hs3.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(L3dp66w8ustOJLN7unY.class)).vekpFI4d1Nc4fakF());
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    String str4 = string;
                    dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4W9sT1Swbhx3hs4 = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                    dfwkxudiclpw1bowh4W9sT1Swbhx3hs4.dDIMxZXP1V8HdM();
                    String packageName = dfwkxudiclpw1bowh4W9sT1Swbhx3hs4.dDIMxZXP1V8HdM.getPackageName();
                    XWeGEfwLMEloqb5 xWeGEfwLMEloqb5 = r5XEUfod5GSCCwq6c.XiR1pIn5878vVWd(extras) ? XWeGEfwLMEloqb5.DISPLAY_NOTIFICATION : XWeGEfwLMEloqb5.DATA_MESSAGE;
                    String string2 = extras.getString("google.message_id");
                    if (string2 == null) {
                        string2 = extras.getString("message_id");
                    }
                    String str5 = string2 != null ? string2 : "";
                    String string3 = extras.getString("from");
                    if (string3 == null || !string3.startsWith("/topics/")) {
                        string3 = null;
                    }
                    String str6 = string3 != null ? string3 : "";
                    String string4 = extras.getString("collapse_key");
                    String str7 = string4 != null ? string4 : "";
                    String string5 = extras.getString("google.c.a.m_l");
                    String str8 = string5 != null ? string5 : "";
                    String string6 = extras.getString("google.c.a.c_l");
                    String str9 = string6 != null ? string6 : "";
                    if (!extras.containsKey("google.c.sender.id")) {
                        dfwkxudiclpw1bowh4W9sT1Swbhx3hs = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                        vTs3SU2MiIMPb2VCqAuc = dfwkxudiclpw1bowh4W9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
                        dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                        str = vTs3SU2MiIMPb2VCqAuc.Ee8d2j4S9Vm5yGuR;
                        if (str != null) {
                            dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                            str2 = vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs;
                            if (str2.startsWith("1:")) {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length >= 2) {
                                    str3 = strArrSplit[1];
                                    if (!str3.isEmpty()) {
                                        j = Long.parseLong(str3);
                                    }
                                }
                                j = 0;
                            } else {
                                j = Long.parseLong(str2);
                            }
                        } else {
                            j = Long.parseLong(str);
                        }
                        break;
                    } else {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                            break;
                        } catch (NumberFormatException unused3) {
                            dfwkxudiclpw1bowh4W9sT1Swbhx3hs = dfwkxUDiclPw1BowH4.w9sT1Swbhx3hs();
                            vTs3SU2MiIMPb2VCqAuc = dfwkxudiclpw1bowh4W9sT1Swbhx3hs.vekpFI4d1Nc4fakF;
                            dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                            str = vTs3SU2MiIMPb2VCqAuc.Ee8d2j4S9Vm5yGuR;
                            if (str != null) {
                                dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                                str2 = vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs;
                                if (str2.startsWith("1:")) {
                                    j = Long.parseLong(str2);
                                } else {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length >= 2) {
                                        str3 = strArrSplit[1];
                                        if (!str3.isEmpty()) {
                                            j = Long.parseLong(str3);
                                        }
                                    }
                                    j = 0;
                                }
                                break;
                            } else {
                                try {
                                    j = Long.parseLong(str);
                                    break;
                                } catch (NumberFormatException unused4) {
                                    dfwkxudiclpw1bowh4W9sT1Swbhx3hs.dDIMxZXP1V8HdM();
                                    str2 = vTs3SU2MiIMPb2VCqAuc.w9sT1Swbhx3hs;
                                    try {
                                        if (str2.startsWith("1:")) {
                                            j = Long.parseLong(str2);
                                        } else {
                                            strArrSplit = str2.split(":");
                                            if (strArrSplit.length >= 2) {
                                                str3 = strArrSplit[1];
                                                if (!str3.isEmpty()) {
                                                    j = Long.parseLong(str3);
                                                }
                                            }
                                            j = 0;
                                        }
                                        break;
                                    } catch (NumberFormatException unused5) {
                                    }
                                }
                            }
                        }
                    }
                    EqyzqFUBl9ymZze eqyzqFUBl9ymZze = new EqyzqFUBl9ymZze(j > 0 ? j : 0L, str5, str4, xWeGEfwLMEloqb5, packageName, str7, i, str6, str8, str9);
                    try {
                        jlshFfo9etdTz jlshffo9etdtz = new jlshFfo9etdTz(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                        DixbgjZDrgKGsYk0Hj dixbgjZDrgKGsYk0Hj = new DixbgjZDrgKGsYk0Hj("proto");
                        new UeVBYgBvSKYfVuXLhMs(15);
                        wPtsfm3myEKujwPqCE wptsfm3myekujwpqce = (wPtsfm3myEKujwPqCE) qbnuJYfmluA6tNLYu;
                        Set set = wptsfm3myekujwpqce.dDIMxZXP1V8HdM;
                        if (!set.contains(dixbgjZDrgKGsYk0Hj)) {
                            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", dixbgjZDrgKGsYk0Hj, set));
                        }
                        oO26y14q3Pwf oo26y14q3pwf = wptsfm3myekujwpqce.w9sT1Swbhx3hs;
                        j378CNXHLyDTS1wSJ j378cnxhlydts1wsj = wptsfm3myekujwpqce.vekpFI4d1Nc4fakF;
                        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOW = new UWYuX9UTvV9YpFO4TOW();
                        uWYuX9UTvV9YpFO4TOW.w9sT1Swbhx3hs = oo26y14q3pwf;
                        uWYuX9UTvV9YpFO4TOW.vekpFI4d1Nc4fakF = dixbgjZDrgKGsYk0Hj;
                        uWYuX9UTvV9YpFO4TOW.JXn4Qf7zpnLjP5 = j378cnxhlydts1wsj;
                        uWYuX9UTvV9YpFO4TOW.Ee8d2j4S9Vm5yGuR(new x88LUeZhTf5gc(new YqGxPPaYwAVe9(eqyzqFUBl9ymZze), jlshffo9etdtz));
                    } catch (RuntimeException unused6) {
                    }
                    break;
                }
                dispatchMessage(intent);
                return;
            case "send_error":
                String messageId = getMessageId(intent);
                String stringExtra2 = intent.getStringExtra("error");
                OYRwk007Mtyi oYRwk007Mtyi = new OYRwk007Mtyi(stringExtra2);
                if (stringExtra2 != null) {
                    stringExtra2.toLowerCase(Locale.US).getClass();
                }
                onSendError(messageId, oYRwk007Mtyi);
                return;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                return;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    private static /* synthetic */ void txgcsmm() {
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().Ee8d2j4S9Vm5yGuR).poll();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(D3nkzQlSKjHnRbwlOY d3nkzQlSKjHnRbwlOY) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(OfLkl9rR9exIS ofLkl9rR9exIS) {
        this.rpc = ofLkl9rR9exIS;
    }
}

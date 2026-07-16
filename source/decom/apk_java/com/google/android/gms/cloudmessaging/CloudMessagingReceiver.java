package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v.s.ANRnCX6eNIDLxM1T0g;
import v.s.NeMF2Rxt7VnmPi5V;
import v.s.SQzPENpgvzKX9IlD;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.nEBfUTMY8S8i6NO;
import v.s.okZcyTTNtG3Y;
import v.s.wx1uy9kWo2J3;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    public static SoftReference dDIMxZXP1V8HdM;

    private static /* synthetic */ void qkyffs() {
    }

    public abstract int dDIMxZXP1V8HdM(Context context, nEBfUTMY8S8i6NO nebfutmy8s8i6no);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        boolean zIsOrderedBroadcast = isOrderedBroadcast();
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (CloudMessagingReceiver.class) {
            try {
                SoftReference softReference = dDIMxZXP1V8HdM;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new okZcyTTNtG3Y("firebase-iid-executor")));
                    dDIMxZXP1V8HdM = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new ANRnCX6eNIDLxM1T0g(this, intent, context, zIsOrderedBroadcast, pendingResultGoAsync));
    }

    public final int vekpFI4d1Nc4fakF(Context context, Intent intent) {
        int i;
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlDW9sT1Swbhx3hs;
        if (intent.getExtras() == null) {
            return 500;
        }
        nEBfUTMY8S8i6NO nebfutmy8s8i6no = new nEBfUTMY8S8i6NO(intent);
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            sQzPENpgvzKX9IlDW9sT1Swbhx3hs = SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
        } else {
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer numValueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            NeMF2Rxt7VnmPi5V neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM = NeMF2Rxt7VnmPi5V.dDIMxZXP1V8HdM(context);
            synchronized (neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM) {
                i = neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5;
                neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = i + 1;
            }
            sQzPENpgvzKX9IlDW9sT1Swbhx3hs = neMF2Rxt7VnmPi5VDDIMxZXP1V8HdM.w9sT1Swbhx3hs(new wx1uy9kWo2J3(i, 2, bundle, 0));
        }
        int iDDIMxZXP1V8HdM = dDIMxZXP1V8HdM(context, nebfutmy8s8i6no);
        try {
            SbxdZ6Kq2uhHQ5RPRqm.w9sT1Swbhx3hs(sQzPENpgvzKX9IlDW9sT1Swbhx3hs, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return iDDIMxZXP1V8HdM;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            "Message ack failed: ".concat(e.toString());
            return iDDIMxZXP1V8HdM;
        }
    }

    public void w9sT1Swbhx3hs(Bundle bundle) {
    }
}

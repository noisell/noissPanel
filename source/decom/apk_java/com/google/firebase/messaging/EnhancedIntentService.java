package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v.s.BTOcbbE0oRvXzVh9;
import v.s.DfUmSWZwfhCUz;
import v.s.PLm4PBpN2BvxERlF4xtd;
import v.s.SQzPENpgvzKX9IlD;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.UE6365QWSHVg5Fff;
import v.s.al3CoDKXO0nvx;
import v.s.cY0DNVJM1fAUrMWIl7k;
import v.s.okZcyTTNtG3Y;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.vM8ZJw883KaO;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new okZcyTTNtG3Y("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static DfUmSWZwfhCUz access$000(EnhancedIntentService enhancedIntentService, Intent intent) {
        if (enhancedIntentService.handleIntentOnMainThread(intent)) {
            return SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
        }
        al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
        enhancedIntentService.executor.execute(new BTOcbbE0oRvXzVh9(enhancedIntentService, intent, al3codkxo0nvx, 2));
        return al3codkxo0nvx.dDIMxZXP1V8HdM;
    }

    public final void dDIMxZXP1V8HdM(Intent intent) {
        if (intent != null) {
            vM8ZJw883KaO.w9sT1Swbhx3hs(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.binder == null) {
                this.binder = new PLm4PBpN2BvxERlF4xtd(new r5XEUfod5GSCCwq6c(8, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        SQzPENpgvzKX9IlD sQzPENpgvzKX9IlDWotphlvK9sPbXJ;
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            dDIMxZXP1V8HdM(intent);
            return 2;
        }
        if (handleIntentOnMainThread(startCommandIntent)) {
            sQzPENpgvzKX9IlDWotphlvK9sPbXJ = SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
        } else {
            al3CoDKXO0nvx al3codkxo0nvx = new al3CoDKXO0nvx();
            this.executor.execute(new BTOcbbE0oRvXzVh9(this, startCommandIntent, al3codkxo0nvx, 2));
            sQzPENpgvzKX9IlDWotphlvK9sPbXJ = al3codkxo0nvx.dDIMxZXP1V8HdM;
        }
        if (sQzPENpgvzKX9IlDWotphlvK9sPbXJ.Ee8d2j4S9Vm5yGuR()) {
            dDIMxZXP1V8HdM(intent);
            return 2;
        }
        sQzPENpgvzKX9IlDWotphlvK9sPbXJ.dDIMxZXP1V8HdM(new UE6365QWSHVg5Fff(1), new cY0DNVJM1fAUrMWIl7k(this, 1, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}

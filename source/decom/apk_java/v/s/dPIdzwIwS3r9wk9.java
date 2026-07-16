package v.s;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class dPIdzwIwS3r9wk9 implements Runnable {
    public final FirebaseMessaging JXn4Qf7zpnLjP5;
    public final PowerManager.WakeLock vekpFI4d1Nc4fakF;
    public final long w9sT1Swbhx3hs;

    public dPIdzwIwS3r9wk9(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new okZcyTTNtG3Y("firebase-iid-executor"));
        this.JXn4Qf7zpnLjP5 = firebaseMessaging;
        this.w9sT1Swbhx3hs = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.w9sT1Swbhx3hs.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.vekpFI4d1Nc4fakF = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    private static /* synthetic */ void aolw() {
    }

    public final boolean dDIMxZXP1V8HdM() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.vekpFI4d1Nc4fakF;
        mYrXZiFjFW2Xg myrxzifjfw2xgDDIMxZXP1V8HdM = mYrXZiFjFW2Xg.dDIMxZXP1V8HdM();
        FirebaseMessaging firebaseMessaging = this.JXn4Qf7zpnLjP5;
        if (myrxzifjfw2xgDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.pyu8ovAipBTLYAiKab = true;
                }
                if (!firebaseMessaging.b1EoSIRjJHO5.vekpFI4d1Nc4fakF()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.pyu8ovAipBTLYAiKab = false;
                    }
                    if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().w9sT1Swbhx3hs(firebaseMessaging.w9sT1Swbhx3hs) || dDIMxZXP1V8HdM()) {
                    if (w9sT1Swbhx3hs()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.pyu8ovAipBTLYAiKab = false;
                        }
                    } else {
                        firebaseMessaging.Ee8d2j4S9Vm5yGuR(this.w9sT1Swbhx3hs);
                    }
                    if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                WtBZXsoeQ5Gr5bcl7Qiw wtBZXsoeQ5Gr5bcl7Qiw = new WtBZXsoeQ5Gr5bcl7Qiw();
                wtBZXsoeQ5Gr5bcl7Qiw.dDIMxZXP1V8HdM = this;
                wtBZXsoeQ5Gr5bcl7Qiw.dDIMxZXP1V8HdM.JXn4Qf7zpnLjP5.w9sT1Swbhx3hs.registerReceiver(wtBZXsoeQ5Gr5bcl7Qiw, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                e.getMessage();
                synchronized (firebaseMessaging) {
                    firebaseMessaging.pyu8ovAipBTLYAiKab = false;
                    if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (mYrXZiFjFW2Xg.dDIMxZXP1V8HdM().vekpFI4d1Nc4fakF(firebaseMessaging.w9sT1Swbhx3hs)) {
                wakeLock.release();
            }
            throw th;
        }
    }

    public final boolean w9sT1Swbhx3hs() throws IOException {
        try {
            return this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

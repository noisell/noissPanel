package v.s;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class UFMdhUYFauq13T4ja1V implements LocationListener {
    public final /* synthetic */ RsA5TguOLrFfTXOtR dDIMxZXP1V8HdM;
    public final /* synthetic */ ax0gnbsXD3up2 vekpFI4d1Nc4fakF;
    public final /* synthetic */ LocationManager w9sT1Swbhx3hs;

    public UFMdhUYFauq13T4ja1V(RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR, LocationManager locationManager, ax0gnbsXD3up2 ax0gnbsxd3up2) {
        this.dDIMxZXP1V8HdM = rsA5TguOLrFfTXOtR;
        this.w9sT1Swbhx3hs = locationManager;
        this.vekpFI4d1Nc4fakF = ax0gnbsxd3up2;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        RsA5TguOLrFfTXOtR rsA5TguOLrFfTXOtR = this.dDIMxZXP1V8HdM;
        if (rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs) {
            return;
        }
        rsA5TguOLrFfTXOtR.w9sT1Swbhx3hs = true;
        this.w9sT1Swbhx3hs.removeUpdates(this);
        this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}

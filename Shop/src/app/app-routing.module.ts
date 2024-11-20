import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PurchaseComponent } from './purchase/purchase.component';
import { SellProductComponent } from './sell-product/sell-product.component';
import { PurchaseDetailsComponent } from './purchase-details/purchase-details.component';
import { ReturnComponent } from './return/return.component';
import { SellDetailsComponent } from './sell-details/sell-details.component';
import { InventoryDetailsComponent } from './inventory-details/inventory-details.component';
import { BillByIdComponent } from './bill-by-id/bill-by-id.component';
import { ReturnDetailsComponent } from './return-details/return-details.component';

const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'purchase-product', component: PurchaseComponent },
  { path: 'sell-product', component: SellProductComponent },
  { path: 'purchase-details', component: PurchaseDetailsComponent },
  { path: 'return-product', component: ReturnComponent },
  { path: 'sell', component: SellDetailsComponent },
  { path: 'inventory', component: InventoryDetailsComponent },
  { path: 'bill', component: BillByIdComponent },
  { path: 'return-details', component: ReturnDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

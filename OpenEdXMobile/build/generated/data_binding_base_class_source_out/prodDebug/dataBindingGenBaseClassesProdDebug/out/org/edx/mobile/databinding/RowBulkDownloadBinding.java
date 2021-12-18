package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.IconImageViewXml;

public abstract class RowBulkDownloadBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clBulkDownloadViewRoot;

  @NonNull
  public final IconImageViewXml ivIcon;

  @NonNull
  public final LinearLayout llContent;

  @NonNull
  public final ProgressBar pbDownload;

  @NonNull
  public final View rowWholeSeparator;

  @NonNull
  public final SwitchCompat swDownload;

  @NonNull
  public final TextView tvSubtitle;

  @NonNull
  public final TextView tvTitle;

  protected RowBulkDownloadBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout clBulkDownloadViewRoot, IconImageViewXml ivIcon,
      LinearLayout llContent, ProgressBar pbDownload, View rowWholeSeparator,
      SwitchCompat swDownload, TextView tvSubtitle, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clBulkDownloadViewRoot = clBulkDownloadViewRoot;
    this.ivIcon = ivIcon;
    this.llContent = llContent;
    this.pbDownload = pbDownload;
    this.rowWholeSeparator = rowWholeSeparator;
    this.swDownload = swDownload;
    this.tvSubtitle = tvSubtitle;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static RowBulkDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RowBulkDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RowBulkDownloadBinding>inflate(inflater, org.edx.mobile.R.layout.row_bulk_download, root, attachToRoot, component);
  }

  @NonNull
  public static RowBulkDownloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RowBulkDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RowBulkDownloadBinding>inflate(inflater, org.edx.mobile.R.layout.row_bulk_download, null, false, component);
  }

  public static RowBulkDownloadBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RowBulkDownloadBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (RowBulkDownloadBinding)bind(component, view, org.edx.mobile.R.layout.row_bulk_download);
  }
}

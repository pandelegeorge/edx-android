package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.EdxWebView;

public abstract class FragmentWebviewDiscoveryBinding extends ViewDataBinding {
  @NonNull
  public final ContentErrorBinding contentError;

  @NonNull
  public final FrameLayout contentErrorRoot;

  @NonNull
  public final FrameLayout flAddOnContainer;

  @NonNull
  public final LinearLayout llContent;

  @NonNull
  public final LoadingIndicatorBinding loadingIndicator;

  @NonNull
  public final EdxWebView webview;

  protected FragmentWebviewDiscoveryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ContentErrorBinding contentError, FrameLayout contentErrorRoot,
      FrameLayout flAddOnContainer, LinearLayout llContent,
      LoadingIndicatorBinding loadingIndicator, EdxWebView webview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentError = contentError;
    setContainedBinding(this.contentError);;
    this.contentErrorRoot = contentErrorRoot;
    this.flAddOnContainer = flAddOnContainer;
    this.llContent = llContent;
    this.loadingIndicator = loadingIndicator;
    setContainedBinding(this.loadingIndicator);;
    this.webview = webview;
  }

  @NonNull
  public static FragmentWebviewDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebviewDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebviewDiscoveryBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_webview_discovery, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWebviewDiscoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebviewDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebviewDiscoveryBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_webview_discovery, null, false, component);
  }

  public static FragmentWebviewDiscoveryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWebviewDiscoveryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWebviewDiscoveryBinding)bind(component, view, org.edx.mobile.R.layout.fragment_webview_discovery);
  }
}

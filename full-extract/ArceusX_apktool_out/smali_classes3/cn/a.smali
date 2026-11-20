.class public final synthetic Lcn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcn/e;


# direct methods
.method public synthetic constructor <init>(Lcn/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcn/a;->a:Lcn/e;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lcn/a;->a:Lcn/e;

    invoke-static {v0, p1}, Lcn/c;->e(Lcn/e;Landroid/content/DialogInterface;)V

    return-void
.end method

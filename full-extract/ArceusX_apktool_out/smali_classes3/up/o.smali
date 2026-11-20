.class public final synthetic Lup/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Lup/p;


# direct methods
.method public synthetic constructor <init>(Lup/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/o;->a:Lup/p;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, Lup/o;->a:Lup/p;

    invoke-static {v0, p1}, Lup/p;->g(Lup/p;Landroid/content/DialogInterface;)V

    return-void
.end method

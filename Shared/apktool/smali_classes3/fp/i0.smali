.class public final synthetic Lfp/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lfp/n0;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lfp/n0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/i0;->a:Lfp/n0;

    iput-object p2, p0, Lfp/i0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lfp/i0;->a:Lfp/n0;

    iget-object v1, p0, Lfp/i0;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lfp/n0;->c(Lfp/n0;Landroid/content/Context;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

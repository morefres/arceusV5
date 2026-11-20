.class public final synthetic Lfp/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lfp/n0;

.field public final synthetic b:Lzo/c;


# direct methods
.method public synthetic constructor <init>(Lfp/n0;Lzo/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/h0;->a:Lfp/n0;

    iput-object p2, p0, Lfp/h0;->b:Lzo/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lfp/h0;->a:Lfp/n0;

    iget-object v1, p0, Lfp/h0;->b:Lzo/c;

    invoke-static {v0, v1, p1}, Lfp/n0;->f(Lfp/n0;Lzo/c;Landroid/view/View;)V

    return-void
.end method

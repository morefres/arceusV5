.class public final Leh/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/f;->a(Leh/i$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Leh/f;


# direct methods
.method public constructor <init>(Leh/f;)V
    .locals 0

    iput-object p1, p0, Leh/f$c;->a:Leh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Leh/f$c;->a:Leh/f;

    invoke-static {p1}, Leh/f;->f(Leh/f;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Leh/f$c;->a:Leh/f;

    sget-object p2, Leh/i$a;->b:Leh/i$a;

    invoke-virtual {p1, p2}, Leh/f;->a(Leh/i$a;)V

    return-void
.end method

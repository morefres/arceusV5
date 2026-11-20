.class public final synthetic Lar/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Llq/h;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Llq/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lar/k2;->a:Llq/h;

    iput p2, p0, Lar/k2;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lar/k2;->a:Llq/h;

    iget v1, p0, Lar/k2;->b:I

    invoke-static {v0, v1}, Lar/p3;->z(Llq/h;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

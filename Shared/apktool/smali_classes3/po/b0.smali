.class public final synthetic Lpo/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lsr/a;

.field public final synthetic b:Ltr/f;


# direct methods
.method public synthetic constructor <init>(Lsr/a;Ltr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/b0;->a:Lsr/a;

    iput-object p2, p0, Lpo/b0;->b:Ltr/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpo/b0;->a:Lsr/a;

    iget-object v1, p0, Lpo/b0;->b:Ltr/f;

    invoke-static {v0, v1}, Lpo/m0;->q(Lsr/a;Ltr/f;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

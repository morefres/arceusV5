.class public final synthetic Ldm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ldm/f;


# direct methods
.method public synthetic constructor <init>(Ldm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldm/e;->a:Ldm/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldm/e;->a:Ldm/f;

    invoke-static {v0}, Ldm/f;->a(Ldm/f;)Le3/o;

    move-result-object v0

    return-object v0
.end method

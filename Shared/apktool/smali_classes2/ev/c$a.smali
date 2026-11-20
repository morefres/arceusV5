.class public Lev/c$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lev/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lev/c$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lev/c;


# direct methods
.method public constructor <init>(Lev/c;)V
    .locals 0

    iput-object p1, p0, Lev/c$a;->a:Lev/c;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lev/c$c;
    .locals 1

    new-instance v0, Lev/c$c;

    invoke-direct {v0}, Lev/c$c;-><init>()V

    return-object v0
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lev/c$a;->a()Lev/c$c;

    move-result-object v0

    return-object v0
.end method

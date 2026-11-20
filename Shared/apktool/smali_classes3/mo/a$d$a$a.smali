.class public final Lmo/a$d$a$a;
.super Lot/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmo/a$d$a;->b(Lmo/a$c;Lmt/b;)Ljava/lang/Object;
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

.annotation runtime Lot/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker$run$1$1"
    f = "GovernmentIdHintWorker.kt"
    l = {
        0x63,
        0x64
    }
    m = "emit"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lmo/a$d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmo/a$d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public w:I


# direct methods
.method public constructor <init>(Lmo/a$d$a;Lmt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmo/a$d$a<",
            "-TT;>;",
            "Lmt/b<",
            "-",
            "Lmo/a$d$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmo/a$d$a$a;->v:Lmo/a$d$a;

    invoke-direct {p0, p2}, Lot/d;-><init>(Lmt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmo/a$d$a$a;->u:Ljava/lang/Object;

    iget p1, p0, Lmo/a$d$a$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmo/a$d$a$a;->w:I

    iget-object p1, p0, Lmo/a$d$a$a;->v:Lmo/a$d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lmo/a$d$a;->b(Lmo/a$c;Lmt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

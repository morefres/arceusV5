.class public Lev/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Ljava/util/concurrent/ExecutorService;

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfv/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lev/d;->k:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lev/d;->a:Z

    iput-boolean v0, p0, Lev/d;->b:Z

    iput-boolean v0, p0, Lev/d;->c:Z

    iput-boolean v0, p0, Lev/d;->d:Z

    iput-boolean v0, p0, Lev/d;->f:Z

    sget-object v0, Lev/d;->k:Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lev/d;->i:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public a()Lev/c;
    .locals 1

    new-instance v0, Lev/c;

    invoke-direct {v0, p0}, Lev/c;-><init>(Lev/d;)V

    return-object v0
.end method
